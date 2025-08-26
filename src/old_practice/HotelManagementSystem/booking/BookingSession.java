package old_practice.HotelManagementSystem.booking;

import old_practice.HotelManagementSystem.booking.amenities.Amenities;
import old_practice.HotelManagementSystem.customer.Customer;
import old_practice.HotelManagementSystem.room.Room;

import java.time.LocalDateTime;

public interface BookingSession {

    boolean bookRoom(Room room, Customer customer, LocalDateTime checkIn, LocalDateTime checkOut);

    boolean checkoutRoom();

    void addAmenities(String roomID,Amenities amenities);

}
