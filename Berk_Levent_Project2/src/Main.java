import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hangi arabayi almak isterseniz?");

        Vehicle_store porsche_store = new Porsche_Store();
        // Porsche fabrikasi kurulumu


        Vehicle vehicle = porsche_store.orderVehicle("Sedan");
        // Yeni aracimiz Porsche vehicle


        //Decorator pattern icin;
        //decorator'u ic dizaynina ahsap ozelligi eklemek istiyoruz. Bazinda plastik var.
        //porsche icin
        System.out.println("---------");

        vehicle = new wood_design(vehicle);
        System.out.println(vehicle.getdizayn());
        System.out.println("---------");

        //customer arabayi aldiysa, facade decorator pattern ile tek tus ile showroom baslatiyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arabayi almaya karar verdiniz mi? \n 1-Evet \n 2-Hayir");

        int purchase;
        purchase = scanner.nextInt();

        //facade ozellikleri tek tusla calisacaklar.

        Lights light = new Lights("Showroom isiklari ");
        Music music = new Music("Aleyna Tilki ");
        Gift gift = new Gift("Size ozel bir hediyemiz ");
        Curtains curtains = new Curtains("Sahnenin ");
        Showroom showroom = new Showroom(light, music, curtains, gift);


        //satin alindiysa showroom baslar.
        if (purchase == 1) {
            showroom.startshowroom(1);

        //satin alma yok ise showroom baslamaz.
        } else {
            showroom.stopshowroom(2);
        }


        //test durumu default olarak unavailable.

        StateChanger statechanger = new StateChanger();
        System.out.println("---------");

        System.out.println("Test Surusu Durumu:" + statechanger.getTestdrive().getClass().getName());
        //test surusu durumu icin.
        System.out.println("---------");
        System.out.println("Test surusune cikmak ister misiniz? \n 1-EVET COK ISTERIM. \n 2-Hayir vazgectim.");
        Scanner scanner1 = new Scanner(System.in);
        int testsurusu = scanner1.nextInt();

        if (testsurusu == 1) {
            System.out.println("Haydi suruse!");
            statechanger.Available();

        } else {
            System.out.println("Surus yok!");
            statechanger.Unavailable();
        }

        System.out.println("Test surusu durumu:" + statechanger.getTestdrive().getClass().getName());
        System.out.println("---------");
        System.out.println("---------");
        System.out.println("YENI ARABA");
        System.out.println("---------");
        System.out.println("---------");
        //FERRARI

        Vehicle_store ferrari_store = new Ferrari_Store();
        // Ferrari fabrikasi kurulumu

        Vehicle vehicle2 = ferrari_store.orderVehicle("Coupe");
        // Yeni aracimiz Ferrari vehicle2

        //ferrari icin

        vehicle2 = new metal_design(vehicle2);
        System.out.println(vehicle2.getdizayn());

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Arabayi almaya karar verdiniz mi? \n 1-Evet \n 2-Hayir");

        int purchase2;
        purchase2 = scanner3.nextInt();

        //facade ozellikleri tek tusla calisacaklar.


        //satin alindiysa showroom baslar.
        if (purchase2 == 1) {
            showroom.startshowroom(1);
            //satin alma yok ise showroom baslamaz.
        } else {
            showroom.stopshowroom(2);
        }

        //test durumu default olarak unavailable.

        System.out.println("---------");
        //test durumunu gostermek icin;
        System.out.println("Test Surusu Durumu:" + statechanger.getTestdrive().getClass().getName());

        System.out.println("---------");
        //test surusu state'i customer istegine gore calisir.
        System.out.println("Test surusune cikmak ister misiniz? \n 1-EVET COK ISTERIM. \n 2-Hayir vazgectim.");
        Scanner scanner4 = new Scanner(System.in);
        int testsurusu2 = scanner4.nextInt();

        if (testsurusu2 == 1) {
            System.out.println("Haydi suruse!");
            statechanger.Available();

        } else {
            System.out.println("Surus yok!");
            statechanger.Unavailable();
        }

        System.out.println("Test surusu durumu:" + statechanger.getTestdrive().getClass().getName());


    }


}
