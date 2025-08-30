package practice_again.ParkingLot.models.ticket;

public class Ticket {
    private Integer floorNumber;
    private Integer parkingLotId;

    public Ticket(Integer floorNumber, Integer parkingLotId) {
        this.floorNumber = floorNumber;
        this.parkingLotId = parkingLotId;
    }
}
