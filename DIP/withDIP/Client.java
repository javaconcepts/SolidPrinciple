package DIP.withDIP;

import DIP.withDIP.config.Database;
import DIP.withDIP.mysql.MysqlDatabase;
import DIP.withDIP.oracle.OracleDatabase;

public class Client {

    public static void main(String[] args) {
        System.out.println("***A demo without DIP***");
        Database oracle = new OracleDatabase();
        oracle.saveEmployeeId("E001");

        Database mysql = new MysqlDatabase();
        mysql.saveEmployeeId("E001");
    }

}
