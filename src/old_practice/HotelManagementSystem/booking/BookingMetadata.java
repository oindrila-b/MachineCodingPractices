package old_practice.HotelManagementSystem.booking;

import old_practice.HotelManagementSystem.booking.amenities.Amenities;

import java.time.LocalDateTime;
import java.util.List;

public class BookingMetadata {
    private String roomID;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private List<Amenities> amenitiesList;

    public BookingMetadata(String roomID, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.roomID = roomID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public BookingMetadata() {
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public void addAmenities(Amenities amenities){
        amenitiesList.add(amenities);
    }

}
