package old_practice.ParkingLot.model.vehicle.vehicles;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.model.vehicle.Vehicle;


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
