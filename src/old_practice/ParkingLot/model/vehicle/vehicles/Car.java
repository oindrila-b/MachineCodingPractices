package old_practice.ParkingLot.model.vehicle.vehicles;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.model.vehicle.Vehicle;

/**
 *  This class represents a Car Object
 * ***/
public class Car extends Vehicle {
    private VehicleType vehicleType;

    public Car(String licenseNumber, String color, VehicleType vehicleType) {
        super(licenseNumber, color);
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
