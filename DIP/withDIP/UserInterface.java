package DIP.withDIP;

import DIP.withDIP.config.Database;

class UserInterface {
     Database db;

    public UserInterface(Database database) {
        this.db = database; // tightly couple
    }

    public void saveEmployeeId(String empId) {
        db.saveEmployeeId(empId);
    }
}