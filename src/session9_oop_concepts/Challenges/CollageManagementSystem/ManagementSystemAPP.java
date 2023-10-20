package session9_oop_concepts.Challenges.CollageManagementSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ManagementSystemAPP {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Johnson", "M", 22,
                "1999-02-03", 123435454, "Python Street");
        Professor professor1 = new Professor("Alice", "Alicenson", "F", 43,
                "1970-03-31", 234532545, "Rust Street");
        Professor professor2 = new Professor("Marie", "Alicenson", "F", 54,
                "1960-05-23", 234537655, "Long Street");

        List<Professor> assignerProfessors = new ArrayList<>();
        Course mathCourse = new Course("Math", LocalDateTime.of(2023, 10, 1, 8, 00),
                3, "Advanced trigonometry ", assignerProfessors);
        Course programmingCourse = new Course("Programming", LocalDateTime.of(2023, 11, 4, 9, 00),
                3, "Python of dummies", assignerProfessors);

        mathCourse.addAssignedProfessor(professor1);
        programmingCourse.addAssignedProfessor(professor2);
        mathCourse.viewCourseDetails();
        programmingCourse.viewCourseDetails();

    }

}
