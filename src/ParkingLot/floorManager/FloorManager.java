package ParkingLot.floorManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.InvalidVehicleIDException;
import ParkingLot.exceptions.MissingTicketPropertyException;
import ParkingLot.exceptions.TicketCreationException;
import ParkingLot.model.floor.Floor;
import ParkingLot.model.slot.Slot;
import ParkingLot.model.ticketModel.Ticket;
import ParkingLot.model.vehicle.Vehicle;

import java.util.List;

public interface FloorManager {

    List<Floor> getPopulatedFloor(int numberOfFloors,int slots);

    boolean isFloorBooked(Floor floor);

    Ticket parkVehicle(VehicleType vehicleType,Floor floor, Vehicle vehicle) throws TicketCreationException, MissingTicketPropertyException;

    boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException;

}
