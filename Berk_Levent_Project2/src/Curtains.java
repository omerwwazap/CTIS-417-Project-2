public class Curtains {
    String description;

    public Curtains(String description) {
        this.description = description;


    }

    public void on() {
        System.out.println(description + "Perdeleri kapansin");
    }

    public void off() {
        System.out.println(description + "PERDELERI ACILSIN");
    }


}
