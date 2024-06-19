package OCP.better.Distinction;

import OCP.better.Students.Student;

public class ArtDistinctionDecider {
    public void evaluatedDistinction(Student student) {

        if (student.getScore() > 70) {
            System.out.println(student.getRegNumber() + " has received a distinction in arts.");
        }
    }

}
