package Holiday.API.Resources;

import java.util.List;
import Holiday.API.DAO.PaymentDAO;
import Holiday.API.Classes.Payment;

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



@Path("/payments")
public class PaymentResource {
    private PaymentDAO paymentDAO = new PaymentDAO();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPayment(@PathParam("id") int id) {
        Payment payment = paymentDAO.getPayment(id);
        if (payment != null) {
            return Response.ok(payment).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPayment(Payment payment) {
        paymentDAO.addPayment(payment);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePayment(@PathParam("id") int id, Payment payment) {
        payment.setId(id);
        paymentDAO.updatePayment(payment);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePayment(@PathParam("id") int id) {
        paymentDAO.deletePayment(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPayments() {
        List<Payment> payments = paymentDAO.getAllPayments();
        return Response.ok(payments).build();
    }
}

