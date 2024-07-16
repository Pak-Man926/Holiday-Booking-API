package Holiday.API.DAO;

import Holiday.API.Classes.*;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class PaymentDAO
{
    private Map<Integer, Payment> payments = new HashMap<>();

    public Payment getPayment(int id) {
        return payments.get(id);
    }

    public void addPayment(Payment payment) {
        payments.put(payment.getId(), payment);
    }

    public void updatePayment(Payment payment) {
        payments.put(payment.getId(), payment);
    }

    public void deletePayment(int id) {
        payments.remove(id);
    }

    public List<Payment> getAllPayments() {
        return new ArrayList<>(payments.values());
    }
}
