package old_practice.HotelManagementSystem.booking.amenities;

import java.math.BigInteger;

public class Amenities {
    private String amenityName;
    public BigInteger price;

    public Amenities(String amenityName, BigInteger price) {
        this.amenityName = amenityName;
        this.price = price;
    }
}
