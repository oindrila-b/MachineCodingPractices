package ParkingLot.slotManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.InvalidVehicleIDException;
import ParkingLot.exceptions.MissingTicketPropertyException;
import ParkingLot.exceptions.TicketCreationException;
import ParkingLot.model.slot.Slot;
import ParkingLot.model.ticketModel.Ticket;
import ParkingLot.model.vehicle.Vehicle;

import java.util.List;

public interface SlotManager {

    List<Slot> getPopulatedSlot(int floorNumber, int numberOfSlots);

    Ticket parkVehicle(VehicleType vehicleType, List<Slot> slots, Vehicle vehicle, String floorID) throws TicketCreationException, MissingTicketPropertyException;

    boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException;

}
