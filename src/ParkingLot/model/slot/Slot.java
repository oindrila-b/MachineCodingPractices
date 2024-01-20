package ParkingLot.model.slot;

import ParkingLot.constants.SlotType;

/***
 *  This class represents the slot of a floor in a parking lot.
 *  It has attributes like slotID,  Car LicenseNumber.
 *  This class will be called by the slot manager to book a slot.
 *
 * **/

public class Slot {
    private String slotID;
    private boolean isBooked;
    private String vehicleLicenseNumber;

    public Slot(String slotID) {
        this.slotID = slotID;
        this.isBooked = false;
        this.vehicleLicenseNumber = null;
    }

    public String getSlotID() {
        return this.slotID;
    }

    public boolean isBooked() {
        return this.isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getVehicleLicenseNumber() {
        return this.vehicleLicenseNumber;
    }

    public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
        this.vehicleLicenseNumber = this.isBooked() ? vehicleLicenseNumber : null;
    }
}
