public class Gift {
    String description;


    public Gift(String description) {
        this.description = description;


    }

    public void on() {
        System.out.println(description + "var!!!!");
    }

    public void off() {
        System.out.println(description + "maalesef yok :( ");
    }


}
