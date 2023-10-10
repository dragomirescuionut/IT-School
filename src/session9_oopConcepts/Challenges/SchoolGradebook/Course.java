package session9_oopConcepts.Challenges.SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String className;
    private String teacher;
    List<Student> students = new ArrayList<>();

    public Course(String className, String teacher){
        this.className = className;
        this.teacher = teacher;
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
