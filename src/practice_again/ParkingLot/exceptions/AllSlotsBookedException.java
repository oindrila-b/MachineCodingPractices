package practice_again.ParkingLot.exceptions;

public class AllSlotsBookedException extends RuntimeException {
    public AllSlotsBookedException() {
        System.out.println("All Slots In this Floor have been booked!");
    }
}
