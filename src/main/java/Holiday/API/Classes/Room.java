package Holiday.API.Classes;

import java.util.ArrayList;
import java.util.List;

public class Room extends Main
{
    private String type;
    private double price;
    private Hotel hotel;
    private List<Booking> bookings = new ArrayList<>();

    public Room()
    {

    }

    public Room(int id, String type, double price, Hotel hotel)
    {
        this.id = id;
        this.type = type;
        this.price = price;
        this.hotel = hotel;
    }

    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public Hotel getHotel()
    {
        return hotel;
    }
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    public List<Booking> getBookings()
    {
        return bookings;
    }
}
