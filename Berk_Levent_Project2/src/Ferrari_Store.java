public class Ferrari_Store extends Vehicle_store {

    Vehicle buildvehicle(String item) {
        if (item.equals("Sedan")) {
            return new Ferrari_Sedan();
        } else if (item.equals("Coupe")) {
            return new Ferrari_Coupe();

        } else return null;
    }

}
