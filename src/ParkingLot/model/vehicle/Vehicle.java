package ParkingLot.model.vehicle;


/***
 *  This class represents a Vehicle object.
 *  This class holds common properties that every vehicle has,
 *  other vehicle classes can extend this class
 *
 * ***/
public class Vehicle {
    protected String licenseNumber;
    protected String color;
    protected boolean isParked;

    public Vehicle(String licenseNumber, String color) {
        this.licenseNumber = licenseNumber;
        this.color = color;
        this.isParked = false;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getColor() {
        return color;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }
}
