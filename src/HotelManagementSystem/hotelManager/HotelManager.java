package HotelManagementSystem.hotelManager;

import HotelManagementSystem.booking.BookingSession;
import HotelManagementSystem.booking.DefaultBookingSession;
import HotelManagementSystem.customer.Customer;
import HotelManagementSystem.exceptions.UnavailableRoomException;
import HotelManagementSystem.room.Room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HotelManager implements HotelManagerInterface {
    private List<Room> rooms;
    private List<BookingSession>  bookingSessions;
    private String hotelName;

    public HotelManager(String hotelName) {
        this.hotelName = hotelName;
        this.bookingSessions = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    @Override
    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    @Override
    public BookingSession bookARoom(String roomNumber,
                                    Customer customer,
                                    LocalDateTime checkIn,
                                    LocalDateTime checkOut)
        throws UnavailableRoomException
    {
        Room room = this.rooms.stream().
                                    filter(r -> r.getRoomNumber().equals(roomNumber) && !r.isBooked()).
                                    findFirst().orElse(null);
        if (room != null) {
            BookingSession bookingSession = new DefaultBookingSession();
            bookingSession.bookRoom(room,customer,checkIn,checkOut);
            bookingSessions.add(bookingSession);
            return bookingSession;
        }
        throw new UnavailableRoomException();
    }


}
