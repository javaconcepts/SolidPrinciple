package LSP.better;

public class Client {

    public static void main(String[] args) {
        System.out.println("***A demo without LSP\n");
        PaymentHelper helper = new PaymentHelper();

        RegistrationUserPayment robin = new RegistrationUserPayment("Robin");
        RegistrationUserPayment jack = new RegistrationUserPayment("Jack");
        GuestUserPayment guestUserPayment = new GuestUserPayment();

        helper.addNewPayment(guestUserPayment);
        helper.addPerviousPayment(robin);
        helper.addPerviousPayment(jack);

        helper.addNewPayment(robin);
        helper.addNewPayment(jack);
        // Processing the payments using

        helper.showPreviousPayments();
        helper.processNewPayments();
    }

}
