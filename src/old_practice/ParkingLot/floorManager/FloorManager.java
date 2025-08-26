package old_practice.ParkingLot.floorManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.InvalidVehicleIDException;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.exceptions.TicketCreationException;
import old_practice.ParkingLot.model.floor.Floor;
import old_practice.ParkingLot.model.ticketModel.Ticket;
import old_practice.ParkingLot.model.vehicle.Vehicle;

import java.util.List;

public interface FloorManager {

    List<Floor> getPopulatedFloor(int numberOfFloors,int slots);

    boolean isFloorBooked(Floor floor);

    Ticket parkVehicle(VehicleType vehicleType,Floor floor, Vehicle vehicle) throws TicketCreationException, MissingTicketPropertyException;

    boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException;

}
