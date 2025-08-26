package old_practice.HotelManagementSystem.room;

public class Room {
    private String roomNumber;
    private String roomType;
    private boolean isBooked;

    public Room(String roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public boolean bookRoom(){
        this.isBooked = true;
        return true;
    }

    public boolean unBookRoom(){
        this.isBooked = false;
        return false;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}
