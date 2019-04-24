import java.util.ArrayList;

public class Car {

    String registrationNumber;
    String type;


    public void park(ParkingLot parkingLot){

       parkingLot.addCar();
    }

    public void Unpark(ParkingLot parkingLot){

        parkingLot.removeCar();
    }



}
