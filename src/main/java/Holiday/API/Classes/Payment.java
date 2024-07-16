package Holiday.API.Classes;

import java.util.Date;

public class Payment extends Main
{
    private Booking booking;
    private double amount;
    private Date paymentDate;

    public Payment()
    {

    }

    public Payment(int id,Booking booking, double amount, Date paymentDate)
    {
        this.id = id;
        this.booking = booking;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public Booking getBooking()
    {
        return booking;
    }
    public void setBooking(Booking booking)
    {
        this.booking = booking;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public Date getPaymentDate()
    {
        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate)
    {
        this.paymentDate = paymentDate;
    }
}
