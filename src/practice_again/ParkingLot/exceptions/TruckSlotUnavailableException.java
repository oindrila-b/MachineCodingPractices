package practice_again.ParkingLot.exceptions;

public class TruckSlotUnavailableException  extends RuntimeException{
    public TruckSlotUnavailableException() {
        System.out.println("All Available Truck Slots Have been booked");
    }
}
