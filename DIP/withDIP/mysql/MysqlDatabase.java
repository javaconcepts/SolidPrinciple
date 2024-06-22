package DIP.withDIP.mysql;

import DIP.withDIP.config.Database;

public class MysqlDatabase implements Database {

    public void saveEmployeeId(String empId) {
        System.out.println("The id: " + empId + "is saved in the Mysql databse");
    }
}
