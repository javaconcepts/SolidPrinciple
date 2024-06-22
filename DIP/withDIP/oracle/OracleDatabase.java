package DIP.withDIP.oracle;

import DIP.withDIP.config.Database;

public class OracleDatabase implements Database {
    public void saveEmployeeId(String empId) {
        System.out.println("The id: " + empId + "is saved in the Oracle databse");
    }
}
