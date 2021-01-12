
import java.util.ArrayList;


public abstract class Vehicle {
    double engine;
    String tracktion;
    int door;
    String dizayn = "plastik";

    String name;

    ArrayList<String> aracozellikleri = new ArrayList<String>();

    void prepare() {
        System.out.println("Your car is:" + name);
        System.out.println("Your car's engine is: " + engine + " Litre");
        System.out.println("Your car's tracktion system is: " + tracktion);
        System.out.println("Your car's door number is: " + door);
        System.out.println("Aracin Baz dizayni :" + getdizayn());

        for (String aracozellikleri : aracozellikleri) {
            System.out.println("   " + aracozellikleri);
        }
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + engine + " ----\n");
        display.append(tracktion + "\n");
        display.append(door + "\n");
        display.append(dizayn);
        for (String topping : aracozellikleri) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

    public String getdizayn() {
        return dizayn;
    }


}
