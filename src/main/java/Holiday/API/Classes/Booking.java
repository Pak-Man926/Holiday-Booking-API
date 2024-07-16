package Holiday.API.Classes;

import java.util.Date;

public class Booking extends Main
{
    private Customer customer;
    private Room room;
    private Date startDate;
    private Date endDate;
    private Payment payment;

    public Booking()
    {

    }

    public Booking(int id, Customer customer, Room room, Date startDate, Date endDate, Payment payment)
    {
        this.id = id;
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public Room getRoom()
    {
        return room;
    }
    public void setRoom(Room room)
    {
        this.room = room;
    }
    public Date getStartDate()
    {
        return startDate;
    }
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }
    public Date getEndDate()
    {
        return endDate;
    }
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }
    public Payment getPayment()
    {
        return payment;
    }
    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }
}
