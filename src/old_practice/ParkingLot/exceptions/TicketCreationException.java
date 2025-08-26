package old_practice.ParkingLot.exceptions;

public class TicketCreationException extends Exception{
    public TicketCreationException() {
        super("Exception while creating ticket");
    }
}
