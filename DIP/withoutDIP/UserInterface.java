package DIP.withoutDIP;

class UserInterface {
    private OracleDatabase db;

    public UserInterface() {
        this.db = new OracleDatabase(); // tightly couple
    }

    public void saveEmployeeId(String empId) {
        db.saveEmployeeId(empId);
    }
}