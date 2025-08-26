package old_practice.ParkingLot.slotManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.InvalidVehicleIDException;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.exceptions.TicketCreationException;
import old_practice.ParkingLot.model.slot.Slot;
import old_practice.ParkingLot.model.ticketModel.Ticket;
import old_practice.ParkingLot.model.vehicle.Vehicle;

import java.util.List;

public interface SlotManager {

    List<Slot> getPopulatedSlot(int floorNumber, int numberOfSlots);

    Ticket parkVehicle(VehicleType vehicleType, List<Slot> slots, Vehicle vehicle, String floorID) throws TicketCreationException, MissingTicketPropertyException;

    boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException;

}
