package session9_oopConcepts.Challenges.CollageManagementSystem;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private double CNP;
    private String address;

    public Person(String firstName, String lastName, String sex, int age, String dateOfBirth, double CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }
}
