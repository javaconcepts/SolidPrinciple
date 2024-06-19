package OCP.better.Distinction;

// import java.util.Arrays;
// import java.util.List;

import OCP.better.Students.Student;

// ocp

public class ScienceDistinctionDecider implements DistinctionDecider{
    // List<String> science = Arrays.asList("Comp.Sc.", "Physics");
    // List<String> arts = Arrays.asList("History", "English");

    public void evaluatedDistinction(Student student) {
    //    if (science.contains(student.getDepartment())) {
            if (student.getScore() > 80) {
                System.out.println(student.getRegNumber() + " has received a distinction in science.");
            }
        }
       
    // }
}
