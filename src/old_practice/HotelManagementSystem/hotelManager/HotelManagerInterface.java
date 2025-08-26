package old_practice.HotelManagementSystem.hotelManager;

import old_practice.HotelManagementSystem.booking.BookingSession;
import old_practice.HotelManagementSystem.customer.Customer;
import old_practice.HotelManagementSystem.exceptions.UnavailableRoomException;
import old_practice.HotelManagementSystem.room.Room;

import java.time.LocalDateTime;

public interface HotelManagerInterface {

    void addRoom(Room room);

    BookingSession bookARoom(String roomNumber, Customer customer, LocalDateTime checkIn, LocalDateTime checkOut) throws UnavailableRoomException;

}
