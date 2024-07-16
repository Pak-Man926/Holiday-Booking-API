package Holiday.API.DAO;

import Holiday.API.Classes.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class RoomDAO
{
    private Map<Integer, Room> rooms = new HashMap<>();

    public Room getRoom(int id)
    {
        return rooms.get(id);
    }

    public void addRoom(Room room)
    {
        rooms.put(room.getId(), room);
    }

    public void updateRoom(Room room) {
        rooms.put(room.getId(), room);
    }

    public void deleteRoom(int id) {
        rooms.remove(id);
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms.values());
    }
}
