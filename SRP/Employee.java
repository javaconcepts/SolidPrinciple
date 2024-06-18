package SRP;
import java.util.Random;

class Employee {

    public String firstName, lastName, empId;
    public double experienceInYears;

    Employee(String firstNaame, String lastName, double experience) {

        this.firstName = firstNaame;
        this.lastName = lastName;
        // this.empId = empId;
        this.experienceInYears = experience;

    }

    public void displayEmpDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("And employee has : " + experienceInYears + " years of experience.");

    }

    // public String generateEmpId(String firstName) {

    // int id = new Random().nextInt(1000);

    // return firstName.substring(0, 1) + id;

    // }

    public static void main(String[] args) {
        System.out.println("*** a demo withou SRP ***");
        Employee emp = new Employee("jaipal", "saini", 7.0);
        showEmpDetails(emp);

        System.out.println("*** ***");
        Employee emp1 = new Employee("jaipal-1", "saini-1", 2.0);
        showEmpDetails(emp1);
    }

    private static void showEmpDetails(Employee emp) {

        emp.displayEmpDetails();
        
        // genearate the Id

        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();

        System.out.println("The employee id: " + idGenerator.generateEmpId(emp.firstName)); // one task

        //Seniority level checker

        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("the employee is a " + seniorityChecker.checkSeniority(emp.experienceInYears)); // second task

    }
}

class SeniorityChecker {

    public String checkSeniority(double experienceInYears) {
        String chec = experienceInYears > (double) 5 ? "Senior" : "Junior";
        return chec;
    }
}

class EmployeeIdGenerator {
    public String generateEmpId(String firstName) {

        int id = new Random().nextInt(1000);

        return firstName.substring(0, 1) + id;

    }
}