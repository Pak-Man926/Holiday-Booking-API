package Holiday.API.Classes;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Main
{
    private String name;

    private List<Booking> bookings = new ArrayList<>();

    private List<Payment> payments = new ArrayList<>();

    public Customer()
    {

    }

    public Customer(int id, String name)
    {
        this.id = id;

        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Booking> getBookings()
    {
        return bookings;
    }

    public List<Payment> getPayments()
    {
        return payments;
    }
}
