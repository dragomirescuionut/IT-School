package session9_oopConcepts.Challenges.SchoolGradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private String name;
    private UUID studentID;
    List<Course> attendedCourses = new ArrayList<>();

    public Student(String name, UUID studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public void attendCourse(Course course){
        attendedCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public UUID getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", attendedCourses=" + attendedCourses +
                '}';
    }
}
