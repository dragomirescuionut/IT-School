package session12_polymorphism.challenges.construction_app;

import java.util.List;

public class Company {
    private List<Employee> employees;

    private void addEmployee(Employee manager, Employee teamMember){
        if (manager.getRole() == Role.MANAGER){
            employees.add(teamMember);
        }
    }
}
