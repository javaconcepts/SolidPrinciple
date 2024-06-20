package LSP.withoutLSP;

import java.util.List;
import java.util.ArrayList;

public class PaymentHelper {
    List<Payment> payments = new ArrayList<Payment>();

    public void addUser(Payment user) {
        payments.add(user);
    }

    public void showPreviousPayments() {
        for (Payment payment : payments) {
            payment.previousPaymentInfo();
            System.out.println("------------------");
        }
    }

    public void processNewPayments() {
        for (Payment payment : payments) {
            payment.newPayment();
            System.out.println("------------------");
        }
    }
}
