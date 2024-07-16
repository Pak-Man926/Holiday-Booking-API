package Holiday.API.DAO;

import Holiday.API.Classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelDAO
{
    private Map<Integer, Hotel> hotels = new HashMap<>();

    public Hotel getHotel(int id)
    {
        return hotels.get(id);
    }

    public void addHotel(Hotel hotel)
    {
        hotels.put(hotel.getId(), hotel);
    }

    public void updateHotel(Hotel hotel)
    {
        hotels.put(hotel.getId(), hotel);
    }

    public void deleteHotel(int id)
    {
        hotels.remove(id);
    }

    public List<Hotel> getAllHotels()
    {
        return new ArrayList<>(hotels.values());
    }
}
