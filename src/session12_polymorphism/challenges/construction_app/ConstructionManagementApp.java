package session12_polymorphism.challenges.construction_app;

import java.util.UUID;

public class ConstructionManagementApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Juan", UUID.randomUUID(), Role.ADMIN);

    }

}
