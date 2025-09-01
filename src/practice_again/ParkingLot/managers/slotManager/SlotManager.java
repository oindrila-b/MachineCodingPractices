package practice_again.ParkingLot.managers.slotManager;

import practice_again.ParkingLot.constants.DefaultValues;
import practice_again.ParkingLot.constants.VEHICLE_TYPE;
import practice_again.ParkingLot.exceptions.AllSlotsBookedException;
import practice_again.ParkingLot.exceptions.TruckSlotUnavailableException;
import practice_again.ParkingLot.models.slot.Slot;

import java.util.ArrayList;
import java.util.List;

public class SlotManager {
    private Integer availableSlots;
    private final Integer MAX_ALLOWED_BIKE_SLOT=2;
    private final Integer MAX_ALLOWED_TRUCK_SLOT=1;
    private Integer bookedBikeSlots= 0;
    private Integer bookedTruckSlots=0;
    private List<Slot> bookedSlots;
    private Integer floorNumber;



    public SlotManager(Integer availableSlots, Integer floorNumber)  throws AllSlotsBookedException, TruckSlotUnavailableException {
        this.availableSlots = (availableSlots!=null) ? availableSlots : 5;;
        bookedSlots = new ArrayList<>();
        this.floorNumber = floorNumber;
    }

    public Integer getAvailableSlots() {
        return availableSlots;
    }

    public boolean bookSlotByVehicleType(VEHICLE_TYPE vehicleType) {
        if (vehicleType == VEHICLE_TYPE.TRUCK ) {
            if (bookedTruckSlots >=MAX_ALLOWED_TRUCK_SLOT) {
                System.out.println("All available truck spots have been booked: Unable to book any further");
                throw new TruckSlotUnavailableException();
            } else {
                // slot manager books a slot
                Slot slot = new Slot(VEHICLE_TYPE.TRUCK, this.floorNumber, this.bookedSlots.size());

                // ticket manager creates a ticket and this returns true.
                // returns true
            }
        }
        if (vehicleType == VEHICLE_TYPE.BIKE) {

        }
        return false;
    }
}
