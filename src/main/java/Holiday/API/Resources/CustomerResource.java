package Holiday.API.Resources;


import Holiday.API.Classes.Customer;
import Holiday.API.DAO.CustomerDAO;

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

import java.util.List;


@Path("/customers")
public class CustomerResource
{
    private CustomerDAO customerDAO = new CustomerDAO();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomer(@PathParam("id") int id)
    {
        Customer customer = customerDAO.getCustomer(id);
        if (customer != null)
        {
            return Response.ok(customer).build();
        }
        else
        {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCustomer(Customer customer)
    {
        customerDAO.addCustomer(customer);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCustomer(@PathParam("id") int id, Customer customer)
    {
        customer.setId(id);
        customerDAO.updateCustomer(customer);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteCustomer(@PathParam("id") int id)
    {
        customerDAO.deleteCustomer(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCustomers()
    {
        List<Customer> customers = customerDAO.getAllCustomers();
        return Response.ok(customers).build();
    }
}

