package Holiday.API.Resources;


import java.util.List;
import Holiday.API.DAO.HotelDAO;
import Holiday.API.Classes.Hotel;

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


@Path("/hotels")
public class HotelResource
{
    private HotelDAO hotelDAO = new HotelDAO();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHotel(@PathParam("id") int id) {
        Hotel hotel = hotelDAO.getHotel(id);
        if (hotel != null) {
            return Response.ok(hotel).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addHotel(Hotel hotel) {
        hotelDAO.addHotel(hotel);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateHotel(@PathParam("id") int id, Hotel hotel) {
        hotel.setId(id);
        hotelDAO.updateHotel(hotel);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteHotel(@PathParam("id") int id) {
        hotelDAO.deleteHotel(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllHotels() {
        List<Hotel> hotels = hotelDAO.getAllHotels();
        return Response.ok(hotels).build();
    }
}
