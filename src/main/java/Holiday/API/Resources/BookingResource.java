package Holiday.API.Resources;

import Holiday.API.Classes.Booking;
import Holiday.API.DAO.BookingDAO;

import java.util.List;
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


@Path("/bookings")
public class BookingResource {
    private BookingDAO bookingDAO = new BookingDAO();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooking(@PathParam("id") int id) {
        Booking booking = bookingDAO.getBooking(id);
        if (booking != null) {
            return Response.ok(booking).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addBooking(Booking booking) {
        bookingDAO.addBooking(booking);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBooking(@PathParam("id") int id, Booking booking) {
        booking.setId(id);
        bookingDAO.updateBooking(booking);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBooking(@PathParam("id") int id) {
        bookingDAO.deleteBooking(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBookings() {
        List<Booking> bookings = bookingDAO.getAllBookings();
        return Response.ok(bookings).build();
    }
}

