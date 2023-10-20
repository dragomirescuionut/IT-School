package session13_recap.challenges.libraryManagementSystem;

import java.time.LocalDate;

public class Author {
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;

    public Author(String name, String nationality, LocalDate dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}