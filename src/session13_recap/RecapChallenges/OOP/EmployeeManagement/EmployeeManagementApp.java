package session13_recap.RecapChallenges.OOP.EmployeeManagement;

import java.util.UUID;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", UUID.randomUUID(), 9000, "Manager");
        emp1.displayEmployeeDetails();
        System.out.println("The annual salary for " + emp1.getName() + " is: " + emp1.calculateAnnualSalary());
        emp1.raiseSalary(1000);
        System.out.println("The new salary after raise: " + emp1.getSalary());
    }
}