public class Main {

    public static void main(String args[])
    {
        Car car1 = new Car();
        ParkingLot parkingLot= new ParkingLot(2);
        car1.park(parkingLot);

        Car car2 = new Car();
        car2.park(parkingLot);
        //if (parkingLot.isFull())
       // {
        //    System.out.println("Parking is full");
        //};
        parkingLot.isFull();

    }
}
