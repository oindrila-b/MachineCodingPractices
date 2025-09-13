package practice_again.ParkingLot.managers.parkingLotManager;

import practice_again.ParkingLot.managers.slotManager.SlotManager;
import practice_again.ParkingLot.managers.ticketManager.TicketManager;

public class ParkingSlotManager {

    SlotManager slotManager;
    TicketManager ticketManager;

    public ParkingSlotManager(SlotManager slotManager, TicketManager ticketManager) {
        this.slotManager = slotManager;
        this.ticketManager = ticketManager;
    }

    public SlotManager getSlotManager() {
        return slotManager;
    }

    public void setSlotManager(SlotManager slotManager) {
        this.slotManager = slotManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public void bookSLot() {}
}
