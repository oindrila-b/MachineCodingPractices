package HotelManagementSystem.booking;

import HotelManagementSystem.booking.amenities.Amenities;
import HotelManagementSystem.customer.Customer;
import HotelManagementSystem.room.Room;

import java.time.LocalDateTime;

public class DefaultBookingSession implements BookingSession {

        BookingMetadata bookingMetadata;
        private Room room;
        private Customer customer;
        private LocalDateTime checkIn;
        private LocalDateTime checkOut;

    public DefaultBookingSession() {

    }

    @Override
    public boolean bookRoom(Room room, Customer customer, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.room = room;
        this.customer = customer;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        room.bookRoom();
        bookingMetadata = new BookingMetadata(room.getRoomNumber().toString(),checkIn,checkOut);
        return true;
    }

    @Override
    public boolean checkoutRoom() {
        this.room.unBookRoom();
        return true;
    }

    @Override
    public void addAmenities(String roomID, Amenities amenities) {
        this.bookingMetadata.addAmenities(amenities);
    }
}
