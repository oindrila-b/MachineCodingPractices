package old_practice.ParkingLot.exceptions;

public class MissingTicketPropertyException extends Exception{
    public MissingTicketPropertyException() {
        super("Failed to create ticket : Missing Ticket Creation Property.");
    }
}
