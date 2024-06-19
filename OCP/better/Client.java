package OCP.better;

import java.util.ArrayList;
import java.util.List;

import OCP.better.Distinction.ArtDistinctionDecider;
import OCP.better.Distinction.ScienceDistinctionDecider;
import OCP.better.Students.ArtStudent;
import OCP.better.Students.ScienceStudent;
import OCP.better.Students.Student;

public class Client {

    public static void main(String[] args) {
        List<Student> st = enrollArtsStudents();
        System.out.println("\n++++++++++++ Arts Student +++++++++++\n");

        for (Student s : st) {
            System.out.println(s);
        }
    
        ArtDistinctionDecider distinctionDecider = new ArtDistinctionDecider();

        for (Student s : st) {
            distinctionDecider.evaluatedDistinction(s);
        }
        System.out.println("\n++++++++++++ Distinction +++++++++++\n");


        List<Student> scienceStudent = enrollArtsStudents();
        System.out.println("\n++++++++++++ Arts Student +++++++++++\n");

        for (Student s : scienceStudent) {
            System.out.println(s);
        }
    
        ScienceDistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();

        for (Student s : st) {
            scienceDistinctionDecider.evaluatedDistinction(s);
        }
        System.out.println("\n++++++++++++ Distinction +++++++++++\n");

    }

    private static List<Student> enrollSciecneStudents() {

        Student sam = new ScienceStudent("sam", "r1", 81.8, "Com.Sc.");
        Student bob = new ScienceStudent("bob", "r1", 81, "Physics");


        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(bob);
        return students;

    }
    private static List<Student> enrollArtsStudents() {

        // Student sam = new Student("sam", "r1", 81.8, "Com.Sc.");
        // Student bob = new Student("bob", "r1", 72, "Physics");
        Student john = new ArtStudent("john", "r1", 80, "History");
        Student kate = new ArtStudent("kate", "r1", 91, "English");

        List<Student> students = new ArrayList<>();

        students.add(john);
        students.add(kate);

        return students;

    }
}
