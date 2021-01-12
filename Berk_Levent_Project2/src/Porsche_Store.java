public class Porsche_Store extends Vehicle_store {


    Vehicle buildvehicle(String item) {
        if (item.equals("Sedan")) {
            return new Porsche_Sedan();
        } else if (item.equals("Coupe")) {
            return new Porsche_Coupe();

        } else return null;
    }


}
