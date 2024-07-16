package Holiday.API.DAO;


import Holiday.API.Classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAO
{
    private Map<Integer, Customer> customers = new HashMap<>();

    public Customer getCustomer(int id)
    {
        return customers.get(id);
    }

    public void addCustomer(Customer customer)
    {
        customers.put(customer.getId(), customer);
    }

    public void updateCustomer(Customer customer)
    {
        customers.put(customer.getId(), customer);
    }

    public void deleteCustomer(int id)
    {
        customers.remove(id);
    }

    public List<Customer> getAllCustomers()
    {
        return new ArrayList<>(customers.values());
    }
}
