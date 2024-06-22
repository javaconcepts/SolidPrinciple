package DIP.withoutDIP;

public class Client {

    public static void main(String[] args) {
        System.out.println("***A demo without DIP***");
        UserInterface obj = new UserInterface();
        obj.saveEmployeeId("E001");
    }

}
