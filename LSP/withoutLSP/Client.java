package LSP;

public class Client {

    public static void main(String[] args) {
        System.out.println("***A demo without LSP\n");
        PaymentHelper helper = new PaymentHelper();

        RegistrationUserPayment robin = new RegistrationUserPayment("Robin");
        RegistrationUserPayment jack = new RegistrationUserPayment("Jack");
        helper.addUser(robin);
        helper.addUser(jack);

        // Processing the payments using

        helper.showPreviousPayments();
        helper.processNewPayments();
    }

}
