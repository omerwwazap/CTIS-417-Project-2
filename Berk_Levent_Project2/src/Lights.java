public class Lights {
    String description;


    public Lights(String description) {
        this.description = description;


    }

    public void on() {
        System.out.println(description + "ACILDI");
    }

    public void off() {
        System.out.println(description + "KAPANDI");
    }


}
