public class Jeep implements Parkable{


    @Override
    public void park(ParkingLot parkinglot) {
        if(!parkinglot.isFull()) {
            parkinglot.addVehicle();
            System.out.println("Jeep has been parked");
        }
    }

    @Override
    public void unpark(ParkingLot parkinglot) {
        parkinglot.removeVehicle();
        System.out.println("Jeep has been unparked");

    }
}
