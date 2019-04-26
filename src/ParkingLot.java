public class ParkingLot {

    private int Capacity;

    public ParkingLot(int Capacity) {
        this.Capacity = Capacity;
    }

    public boolean isFull()
    {
        if (Capacity == 0) {

            System.out.println("Parking is full");
            return true;
        }
        else
        {
            return false;
        }
    }

    public void addVehicle()
    {

        if(!isFull()) {
            Capacity--;
            System.out.println("Parking is available");
        }
        else
            System.out.println("Parking not available");

    }

    public void removeVehicle()
    {
        Capacity++;
        System.out.println("Availability after unparking is "+Capacity);
    }

}
