package LSP.better;

class GuestUserPayment implements NewPayment {
    String name;

    GuestUserPayment() {
        name = "guest";
    }

    public void newPayment() {
        System.out.println("Retrieving  " + name + " current payment details.");

    }

}