package ISP.withoutISP;

public class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("basic print document. ");
    }

    public void sendFax() {
        throw new UnsupportedOperationException();
        // System.out.println("basic fax. ");
    }
}
