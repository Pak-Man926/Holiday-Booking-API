package Holiday.API.DAO;

import Holiday.API.Classes.*;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class BookingDAO
{
    private Map<Integer, Booking> bookings = new HashMap<>();

    public Booking getBooking(int id) {
        return bookings.get(id);
    }

    public void addBooking(Booking booking) {
        bookings.put(booking.getId(), booking);
    }

    public void updateBooking(Booking booking) {
        bookings.put(booking.getId(), booking);
    }

    public void deleteBooking(int id) {
        bookings.remove(id);
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }
}
