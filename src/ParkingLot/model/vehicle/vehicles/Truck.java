package ParkingLot.model.vehicle.vehicles;

import ParkingLot.constants.VehicleType;
import ParkingLot.model.vehicle.Vehicle;


/**
 *  This class represents a Truck Object
 * ***/
public class Truck extends Vehicle {
    private VehicleType vehicleType;

    public Truck(String licenseNumber, String color, VehicleType vehicleType) {
        super(licenseNumber, color);
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
