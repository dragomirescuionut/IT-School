package session15_equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodePractice {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setFirstName("Alice");
        emp1.setLastName("Bond");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setFirstName("Alice");
        emp2.setFirstName("Bond");

        System.out.println("Employee equals empoyee2  " + emp1.equals(emp2));
        System.out.println("employee1 hashcode: " + emp1.hashCode());
        System.out.println("employee2 hashcode: " + emp2.hashCode());

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);

        System.out.println("Set size:" + employeeSet.size());

        System.out.println("Employee1: " + emp1);

    }
}