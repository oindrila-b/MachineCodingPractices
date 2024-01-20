package ParkingLot.parkingManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.TicketCreationException;
import ParkingLot.model.ticketModel.Ticket;
import ParkingLot.model.vehicle.Vehicle;

public interface ParkingManagerInterface {

    void populateFloorData(int numberOfFloors, int slots);

    boolean isParkingLotBooked();

    Ticket bookSlot(VehicleType vehicleType, Vehicle vehicle) throws TicketCreationException;

}
