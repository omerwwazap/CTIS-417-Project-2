public class Music {
    String description;


    public Music(String description) {
        this.description = description;


    }

    public void on() {
        System.out.println(description + "Calmaya Basladi.");
    }

    public void off() {
        System.out.println(description + "Durduruldu.");
    }


}
