public abstract class Vehicle implements Parkable{
    private String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void park(ParkingLot parkinglot) {
        if(!parkinglot.isFull()) {
            parkinglot.addVehicle();
            System.out.println(name + " has been parked");
        }
    }

    @Override
    public void unpark(ParkingLot parkinglot) {
        System.out.println(name + " has been unparked");
        parkinglot.removeVehicle();
    }

}



