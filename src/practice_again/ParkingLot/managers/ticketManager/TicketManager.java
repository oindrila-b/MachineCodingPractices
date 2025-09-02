package practice_again.ParkingLot.managers.ticketManager;

public class TicketManager {


    public String createTicket(String parkingLotId, Integer number, Integer slotNumber) {
        return parkingLotId+number+slotNumber;
    }

}
