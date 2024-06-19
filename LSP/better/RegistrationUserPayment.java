package LSP.better;

public class RegistrationUserPayment implements PreviousPayment, NewPayment {
    String name;

    RegistrationUserPayment(String userName) {
        name = userName;
    }

    public void previousPaymentInfo() {
        System.out.println("Retrieving  " + name + " last payment details.");
    }

    public void newPayment() {
        System.out.println("Retrieving  " + name + " current payment details.");

    }

}
