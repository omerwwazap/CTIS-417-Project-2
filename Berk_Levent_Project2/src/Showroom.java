public class Showroom {
    Lights lights;
    Music music;
    Curtains curtains;
    Gift gift;


    public Showroom(Lights lights, Music music, Curtains curtains, Gift gift) {


        this.curtains = curtains;
        this.lights = lights;
        this.music = music;
        this.gift = gift;

    }

    public void startshowroom(int purchase) {
        System.out.println("HAYIRLI OLSUNNNNNN!!!! SHOW BASLIYOR1!!!");

        lights.on();
        curtains.off();
        music.on();
        gift.on();
    }

    public void stopshowroom(int purchase) {
        System.out.println("aaaaaa yine bekleriz :(");

        lights.off();
        curtains.on();
        music.off();
        gift.off();
    }


}
