public class Main {

    public static void main(String args[])
    {

        Vehicle car1 = new Car("Car1");
        Vehicle car2 = new Car("Car2");
        Vehicle jeep1 = new Jeep("Jeep1");
        Vehicle jeep2 = new Jeep("Jeep2");
        ParkingLot parkingLot= new ParkingLot(3);

        car1.park(parkingLot);
        car2.park(parkingLot);
        jeep1.park(parkingLot);
        jeep2.park(parkingLot);
        car1.unpark(parkingLot);
        jeep1.unpark(parkingLot);



    }
}
