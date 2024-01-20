package ParkingLot.ticketManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.MissingTicketPropertyException;
import ParkingLot.model.ticketModel.Ticket;

public interface TicketManager {
    Ticket createTicket(String slotID, String floorID, VehicleType vehicleType, String vehicleNumber) throws MissingTicketPropertyException;
}
