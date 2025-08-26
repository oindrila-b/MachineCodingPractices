package old_practice.ParkingLot.parkingManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.exceptions.TicketCreationException;
import old_practice.ParkingLot.model.ticketModel.Ticket;
import old_practice.ParkingLot.model.vehicle.Vehicle;

public interface ParkingManagerInterface {

    void populateFloorData(int numberOfFloors, int slots);

    boolean isParkingLotBooked();

    Ticket bookSlot(VehicleType vehicleType, Vehicle vehicle) throws TicketCreationException, MissingTicketPropertyException;

}
