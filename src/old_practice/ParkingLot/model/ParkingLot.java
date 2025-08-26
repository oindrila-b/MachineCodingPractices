package old_practice.ParkingLot.model;

import old_practice.ParkingLot.model.floor.Floor;

import java.util.List;

public class ParkingLot {
    List<Floor> parkingLotFloors;

    public ParkingLot(List<Floor> parkingLotFloors) {
        this.parkingLotFloors = parkingLotFloors;
    }

    public List<Floor> getParkingLotFloors() {
        return parkingLotFloors;
    }
}
