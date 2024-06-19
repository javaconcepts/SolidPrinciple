package OCP.analysis;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Student> st = enrollStudents();
        System.out.println("\n++++++++++++ Student +++++++++++\n");

        for (Student s : st) {
            System.out.println(s);
        }
        System.out.println("\n++++++++++++ Close Student +++++++++++\n");


        System.out.println("\n++++++++++++ Distinction +++++++++++\n");
        DistinctionDecider distinctionDecider = new DistinctionDecider();

        for (Student s : st) {
            distinctionDecider.evaluatedDistinction(s);
        }
        System.out.println("\n++++++++++++ Distinction +++++++++++\n");

    }

    private static List<Student> enrollStudents() {

        Student sam = new Student("sam", "r1", 81.8, "Com.Sc.");
        Student bob = new Student("bob", "r1", 72, "Physics");
        Student john = new Student("john", "r1", 71.8, "History");
        Student kate = new Student("kate", "r1", 66.8, "English");

        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(bob);
        students.add(john);
        students.add(kate);

        return students;

    }
}
