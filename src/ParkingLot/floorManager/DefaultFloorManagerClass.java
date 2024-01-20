package ParkingLot.floorManager;

import ParkingLot.constants.VehicleType;
import ParkingLot.exceptions.InvalidVehicleIDException;
import ParkingLot.exceptions.MissingTicketPropertyException;
import ParkingLot.exceptions.TicketCreationException;
import ParkingLot.model.floor.Floor;
import ParkingLot.model.slot.Slot;
import ParkingLot.model.ticketModel.Ticket;
import ParkingLot.model.vehicle.Vehicle;
import ParkingLot.slotManager.DefaultSlotManager;
import ParkingLot.slotManager.SlotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class DefaultFloorManagerClass implements FloorManager{

    private SlotManager slotManager;
    private List<Floor> floors;
    private Map<Integer, Boolean>floorBooked;

    public DefaultFloorManagerClass() {
        slotManager = new DefaultSlotManager();
        floors = new ArrayList<>();
        floorBooked = new HashMap<>();
    }

    @Override
    public List<Floor> getPopulatedFloor(int numberOfFloors, int slots) {
        for (int i = 1; i <= numberOfFloors; i++) {
            List<Slot> floorSlots= slotManager.getPopulatedSlot(i,slots);
            floors.add(new Floor(i, floorSlots));
        }
        return floors;
    }

    @Override
    public boolean isFloorBooked(Floor floor) {
        AtomicBoolean isBooked = new AtomicBoolean(true);
        List<Slot> slots = floor.getSlots();
        slots.stream().forEach(slot -> {
            if (!slot.isBooked()) isBooked.set(false);
        });
        floorBooked.put(floor.getFloorNumber(), isBooked.get());
        return floorBooked.get(floor.getFloorNumber());
    }

    @Override
    public Ticket parkVehicle(VehicleType vehicleType, Floor floor, Vehicle vehicle) throws TicketCreationException, MissingTicketPropertyException {

        for (int i = 1; i <= floors.size(); i++) {
            if (!isFloorBooked(floors.get(i))) {
                Ticket ticket = slotManager.parkVehicle(vehicleType,floor.getSlots(),vehicle,String.valueOf(i));
                return ticket;
            }
        }
        return null;
    }

    @Override
    public boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException {
        return slotManager.unParkVehicle(vehicleID);
    }
}
