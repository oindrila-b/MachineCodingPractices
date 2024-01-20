package ParkingLot.model.ticketModel;

import ParkingLot.constants.VehicleType;

/**
 *  This class represents a ticket that will be created when
 *  a car will be parked in a perking spot
 *
 * **/
public class Ticket {
    private String ticketID;
    private String slotID;
    private String floorID;
    private VehicleType vehicleType;
    private String vehicleLicenseNumber;

    public Ticket( String ticketID,String floorID,String slotID, VehicleType vehicleType, String carNumber) {
        this.ticketID = ticketID;
        this.slotID = slotID;
        this.vehicleType = vehicleType;
        this.floorID = floorID;
        this.vehicleLicenseNumber = carNumber;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getSlotID() {
        return slotID;
    }

    public String getFloorID() {
        return floorID;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleLicenseNumber() {
        return vehicleLicenseNumber;
    }
}
