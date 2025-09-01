package practice_again.ParkingLot.exceptions;

public class BikeSlotUnavailableException extends RuntimeException {
    public BikeSlotUnavailableException() {
        System.out.println("All available bike slots have been booked!");
    }
}
