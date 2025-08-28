package practice_again.ParkingLot.models.parkingLot;

import practice_again.ParkingLot.models.slot.Slot;

import java.util.List;

public class ParkingLot {

    private Integer parkingLotNumber;
    private List<Slot> parkingSlot;

    public ParkingLot(Integer parkingLotNumber, List<Slot> parkingSlot) {
        this.parkingLotNumber = parkingLotNumber;
        this.parkingSlot = parkingSlot;
    }

    public Integer getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(Integer parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public List<Slot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<Slot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
