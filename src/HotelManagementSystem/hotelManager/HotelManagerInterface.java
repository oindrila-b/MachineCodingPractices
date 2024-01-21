package HotelManagementSystem.hotelManager;

import HotelManagementSystem.booking.BookingSession;
import HotelManagementSystem.customer.Customer;
import HotelManagementSystem.exceptions.UnavailableRoomException;
import HotelManagementSystem.room.Room;

import java.time.LocalDateTime;

public interface HotelManagerInterface {

    void addRoom(Room room);

    BookingSession bookARoom(String roomNumber, Customer customer, LocalDateTime checkIn, LocalDateTime checkOut) throws UnavailableRoomException;

}
