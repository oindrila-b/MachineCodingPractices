package old_practice.ParkingLot.model.floor;

import old_practice.ParkingLot.model.slot.Slot;

import java.util.List;

public class Floor {
    private Integer floorNumber;
    private List<Slot> slots;
    private boolean isBookedEntirely;

    public Floor(Integer floorNumber, List<Slot> slots) {
        this.floorNumber = floorNumber;
        this.slots = slots;
        isBookedEntirely = false;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public boolean isBookedEntirely() {
        return isBookedEntirely;
    }

    public void setBookedEntirely(boolean bookedEntirely) {
        isBookedEntirely = bookedEntirely;
    }
}
