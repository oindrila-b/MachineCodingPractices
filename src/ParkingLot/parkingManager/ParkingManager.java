package ParkingLot.parkingManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.TicketCreationException;
import ParkingLot.floorManager.DefaultFloorManagerClass;
import ParkingLot.floorManager.FloorManager;
import ParkingLot.model.floor.Floor;
import ParkingLot.model.ticketModel.Ticket;
import ParkingLot.model.vehicle.Vehicle;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParkingManager implements ParkingManagerInterface {
    private int numberOfFloors;
    private int slotEachFloor;
    private FloorManager floorManager;
    private List<Floor> floors;


    public ParkingManager(int numberOfFloors, int slotEachFloor) {
        this.numberOfFloors = numberOfFloors;
        this.slotEachFloor = slotEachFloor;
        floorManager = new DefaultFloorManagerClass();
    }


    @Override
    public void populateFloorData(int numberOfFloors, int slots) {
        floors = floorManager.getPopulatedFloor(numberOfFloors,slots);
    }

    @Override
    public boolean isParkingLotBooked() {
        for (int i = 1; i <= this.floors.size() ; i++) {
            if (!floors.get(i).isBookedEntirely()) return false;
        }
        return true;
    }

    @Override
    public Ticket bookSlot(VehicleType vehicleType, Vehicle vehicle) throws TicketCreationException {
        for (int i = 0; i < floors.size(); i++) {
            if (!floorManager.isFloorBooked(floors.get(i))) {
                return floorManager.parkVehicle(vehicleType, floors.get(i), vehicle );
            }
        }
        return null;
    }
}
