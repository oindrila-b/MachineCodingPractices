package old_practice.HotelManagementSystem.hotelManager;

import old_practice.HotelManagementSystem.booking.BookingSession;
import old_practice.HotelManagementSystem.booking.DefaultBookingSession;
import old_practice.HotelManagementSystem.customer.Customer;
import old_practice.HotelManagementSystem.exceptions.UnavailableRoomException;
import old_practice.HotelManagementSystem.room.Room;

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
