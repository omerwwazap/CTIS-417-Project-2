import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// burada state'in test durumundaki degisiklikleri logluyoruz log.txt'tye.
//loger instance sadece 1 tane create edilebilir, tum projede baska uretilemez buradan cagirilir.
public class LoggerSingleton {

    private static LoggerSingleton logger = null;

    private final String logFile = "log.txt";
    private PrintWriter writer;

    private LoggerSingleton() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
        }
    }

    public static synchronized LoggerSingleton getInstance() {
        if (logger == null)
            logger = new LoggerSingleton();
        return logger;
    }

    public void logger(String testdurumu) {
        writer.println("State Changed: " + testdurumu);
    }
}