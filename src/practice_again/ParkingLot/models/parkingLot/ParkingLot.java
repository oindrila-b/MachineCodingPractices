package practice_again.ParkingLot.models.parkingLot;

import practice_again.ParkingLot.constants.BOOKING_STATUS;
import practice_again.ParkingLot.models.slot.Slot;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingLot {

    private Integer parkingLotNumber;
    private HashMap<Slot, BOOKING_STATUS> parkingSlot;
    private AtomicInteger currentlyBookedSlot;

    public ParkingLot(Integer parkingLotNumber, HashMap<Slot, BOOKING_STATUS> parkingSlot) {
        this.parkingLotNumber = parkingLotNumber;
        this.parkingSlot = parkingSlot;
    }

    public Integer getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(Integer parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public HashMap<Slot, BOOKING_STATUS> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(HashMap<Slot, BOOKING_STATUS> parkingSlot)  {
        this.parkingSlot = parkingSlot;
    }

    public boolean bookSlot() {

        return false;
    }
}
