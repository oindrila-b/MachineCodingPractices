package practice_again.ParkingLot.models.slot;

import practice_again.ParkingLot.constants.VEHICLE_TYPE;

public class Slot {

    private VEHICLE_TYPE vehicleTypeSlot;
    private  Integer floorNumber;
    private Integer slotNumber;

    public Slot(VEHICLE_TYPE vehicleTypeSlot, Integer floorNumber, Integer slotNumber) {
        this.vehicleTypeSlot = vehicleTypeSlot;
        this.floorNumber = floorNumber;
        this.slotNumber = slotNumber;
    }

    public VEHICLE_TYPE getVehicleTypeSlot() {
        return vehicleTypeSlot;
    }

    public void setVehicleTypeSlot(VEHICLE_TYPE vehicleTypeSlot) {
        this.vehicleTypeSlot = vehicleTypeSlot;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }
}
