package Holiday.API.Exceptions;

import Holiday.API.Resources.CustomerResource;
import Holiday.API.Resources.HotelResource;
import Holiday.API.Resources.RoomResource;
import Holiday.API.Resources.BookingResource;
import Holiday.API.Resources.PaymentResource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplicationConfig extends jakarta.ws.rs.core.Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(CustomerResource.class);
        resources.add(HotelResource.class);
        resources.add(RoomResource.class);
        resources.add(BookingResource.class);
        resources.add(PaymentResource.class);
        resources.add(CustomExceptionMapper.class);
        return resources;
    }
}
