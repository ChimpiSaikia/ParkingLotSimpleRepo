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
            System.out.println("Parking is available");
            return false;
        }
    }

    public void addCar()
    {
        Capacity--;
    }

    public void removeCar()
    {
        Capacity++;
    }

}
