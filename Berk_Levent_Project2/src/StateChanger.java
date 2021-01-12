public class StateChanger {
    private Testdrive testdrive;
    LoggerSingleton sing = LoggerSingleton.getInstance();


    public Testdrive getTestdrive() {
        return testdrive;
    }

    public void setTestdrive(Testdrive testdrive) {
        this.testdrive = testdrive;
    }

    public StateChanger() {
        setTestdrive(new UnavailableTestDrive());

    }

    public void Available() {
        testdrive.Available();
        if (testdrive instanceof UnavailableTestDrive) {
            sing.logger("/ state changed to available");

            setTestdrive(new AvailableTestDrive());
            //         System.out.println("artik test surusune cikmaya uygun."+testdrive.getClass().getName());
        }
    }

    public void Unavailable() {
        testdrive.Unavailable();
        if (testdrive instanceof AvailableTestDrive) {
            sing.logger("/ state changed to unavailable ");

            setTestdrive(new AvailableTestDrive());
            //   System.out.println(" test surusune cikmaya uygun degil."+testdrive.getClass().getName());
        }


    }

}
