public abstract class Vehicle_store {


    abstract Vehicle buildvehicle(String item);


    public Vehicle orderVehicle(String type) {
        Vehicle vehicle = buildvehicle(type);
        // System.out.println("--- Making a "+vehicle.aracozellikleri);

        vehicle.prepare();


        return vehicle;
    }


}
