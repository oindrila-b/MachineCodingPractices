package practice_again.ParkingLot.models.slot.implementations;

import practice_again.ParkingLot.constants.VEHICLE_TYPE;
import practice_again.ParkingLot.models.slot.Slot;

public class BikeSlot extends Slot {
    public BikeSlot(VEHICLE_TYPE vehicleTypeSlot, Integer floorNumber, Integer slotNumber) {
        super(vehicleTypeSlot, floorNumber, slotNumber);
    }

}
