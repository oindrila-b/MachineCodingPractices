package HotelManagementSystem.booking;

import HotelManagementSystem.booking.amenities.Amenities;
import HotelManagementSystem.customer.Customer;
import HotelManagementSystem.room.Room;

import java.time.LocalDateTime;

public interface BookingSession {

    boolean bookRoom(Room room, Customer customer, LocalDateTime checkIn, LocalDateTime checkOut);

    boolean checkoutRoom();

    void addAmenities(String roomID,Amenities amenities);

}
