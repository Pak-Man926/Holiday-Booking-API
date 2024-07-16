package Holiday.API.Resources;

import java.util.List;
import Holiday.API.DAO.RoomDAO;
import Holiday.API.Classes.Room;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("/rooms")
public class RoomResource {
    private RoomDAO roomDAO = new RoomDAO();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoom(@PathParam("id") int id) {
        Room room = roomDAO.getRoom(id);
        if (room != null) {
            return Response.ok(room).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addRoom(Room room) {
        roomDAO.addRoom(room);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateRoom(@PathParam("id") int id, Room room) {
        room.setId(id);
        roomDAO.updateRoom(room);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteRoom(@PathParam("id") int id) {
        roomDAO.deleteRoom(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllRooms() {
        List<Room> rooms = roomDAO.getAllRooms();
        return Response.ok(rooms).build();
    }
}

