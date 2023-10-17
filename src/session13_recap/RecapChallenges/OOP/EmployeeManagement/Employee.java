package session13_recap.RecapChallenges.OOP.EmployeeManagement;

import java.util.UUID;

public class Employee {
    private String name;
    private UUID employeeId;
    private int salary;
    private String jobTitle;

    public Employee(String name, UUID employeeId, int salary, String jobTitle) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public int calculateAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int amount) {
        if (amount < 0) {
            System.out.println("Please enter a valid amount! ");
        }
        else{
            salary+=amount;
        }
        return salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee's name: " + name + "\nEmployee ID: " + employeeId + "\nSalary: " + salary + "\nJob Title: " + jobTitle);
    }

    public String getName() {
        return name;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}