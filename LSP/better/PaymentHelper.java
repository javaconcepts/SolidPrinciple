package LSP.better;

import java.util.List;
import java.util.ArrayList;

public class PaymentHelper {
    List<PreviousPayment> payments = new ArrayList<PreviousPayment>();
    List<NewPayment> newPayments = new ArrayList<NewPayment>();

    public void addPerviousPayment(PreviousPayment user) {
        payments.add(user);
    }

    public void addNewPayment(NewPayment newPayment){
        newPayments.add(newPayment);
    }
    public void showPreviousPayments() {
        for (PreviousPayment payment : payments) {
            payment.previousPaymentInfo();
            System.out.println("------------------");
        }
    }

    public void processNewPayments() {
        for (NewPayment payment : newPayments) {
            payment.newPayment();
            System.out.println("------------------");
        }
    }
}
