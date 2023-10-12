package session12_polymorphism.challenges.constructionApp;

import java.util.List;

public class Company {
    private List<Employee> employees;

    private void addEmployee(Employee manager, Employee teamMember){
        if (manager.getRole() == Role.MANAGER){
            employees.add(teamMember);
        }
    }
}
