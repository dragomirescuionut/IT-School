package session12_polymorphism.challenges.constructionApp;

import java.util.UUID;

public class Employee{
    private String name;
    final UUID employeeID;
    private Role role;

    public Employee(String name, UUID employeeID, Role role) {
        this.name = name;
        this.employeeID = employeeID;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getEmployeeID() {
        return employeeID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}