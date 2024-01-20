package ParkingLot.model.vehicle.vehicles;

import ParkingLot.constants.VehicleType;
import ParkingLot.model.vehicle.Vehicle;

/**
 *  This class represents a Bike Object
 * ***/
public class Bike extends Vehicle {
    private VehicleType vehicleType;

    public Bike(String licenseNumber, String color, VehicleType vehicleType) {
        super(licenseNumber, color);
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
