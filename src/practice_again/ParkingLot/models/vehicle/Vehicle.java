package practice_again.ParkingLot.models.vehicle;

import practice_again.ParkingLot.constants.VEHICLE_TYPE;

public class Vehicle {
    public VEHICLE_TYPE vehicleType;
    public String registrationNumber;
    public String colour;

    public VEHICLE_TYPE getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VEHICLE_TYPE vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
