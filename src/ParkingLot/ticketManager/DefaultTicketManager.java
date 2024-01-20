package ParkingLot.ticketManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.MissingTicketPropertyException;
import ParkingLot.model.ticketModel.Ticket;

public class DefaultTicketManager implements TicketManager{
    @Override
    public Ticket createTicket(String slotID, String floorID, VehicleType vehicleType, String vehicleNumber) throws MissingTicketPropertyException {
        String tickedID = slotID+floorID+"-"+System.currentTimeMillis();
        if (slotID.isEmpty() || floorID.isEmpty() || vehicleNumber.isEmpty() || vehicleType == null) throw new MissingTicketPropertyException();
       return new Ticket(tickedID, floorID,slotID,vehicleType,vehicleNumber);
    }
}
