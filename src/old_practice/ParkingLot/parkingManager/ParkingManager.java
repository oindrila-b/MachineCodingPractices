package old_practice.ParkingLot.parkingManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.exceptions.TicketCreationException;
import old_practice.ParkingLot.floorManager.DefaultFloorManagerClass;
import old_practice.ParkingLot.floorManager.FloorManager;
import old_practice.ParkingLot.model.floor.Floor;
import old_practice.ParkingLot.model.ticketModel.Ticket;
import old_practice.ParkingLot.model.vehicle.Vehicle;

import java.util.List;

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
    public Ticket bookSlot(VehicleType vehicleType, Vehicle vehicle) throws TicketCreationException, MissingTicketPropertyException {
        for (int i = 0; i < floors.size(); i++) {
            if (!floorManager.isFloorBooked(floors.get(i))) {
                return floorManager.parkVehicle(vehicleType, floors.get(i), vehicle );
            }
        }
        return null;
    }
}
