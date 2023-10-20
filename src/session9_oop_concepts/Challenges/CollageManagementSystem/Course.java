package session9_oop_concepts.Challenges.CollageManagementSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Course {
    private String subject;
    private LocalDateTime schedule;
    private int duration;
    private String description;
    private List<Professor> assignedProfessors;

    public Course(String subject, LocalDateTime schedule, int duration, String description, List<Professor> assignedProfessors) {
        this.subject = subject;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProfessors = assignedProfessors;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public List<Professor> getAssignedProfessors() {
        return assignedProfessors;
    }

    public void addAssignedProfessor(Professor professor) {
        assignedProfessors.add(professor);
    }

    public void viewCourseDetails() {
        System.out.println("Course name: " + this.getSubject());
        System.out.println("Starting date: " + this.getSchedule());
        System.out.println("Duration: " + this.getDuration() + "months");
        System.out.println("Description: " + this.getDescription());

        List<Professor> assignedProfessors = this.getAssignedProfessors();
        if (!assignedProfessors.isEmpty()) {
            System.out.println("A professor needs to be assigned! ");
            for (Professor professor : assignedProfessors) {
                System.out.println("- " + professor.getFirstName() + " " + professor.getLastName());
            }
        } else {
            System.out.println("No professor assigned to this course! ");
        }
    }
}
