package ISP.withISP;

public class AdvancedPrinter implements Printer, FaxDevice {
    public void printDocument() {
        System.out.println("advanced print document. ");
    }

    public void sendFax() {
        System.out.println("send fax. ");
    }
}
