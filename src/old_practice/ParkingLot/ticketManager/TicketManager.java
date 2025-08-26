package old_practice.ParkingLot.ticketManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.model.ticketModel.Ticket;

public interface TicketManager {
    Ticket createTicket(String slotID, String floorID, VehicleType vehicleType, String vehicleNumber) throws MissingTicketPropertyException;
}
