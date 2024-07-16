package Holiday.API.Classes;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Main
{
    private String name;
    private List<Room> rooms = new ArrayList<>();

    public Hotel()
    {

    }

    public Hotel(int id, String name)
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

    public List<Room> getRooms()
    {
        return rooms;
    }
}
