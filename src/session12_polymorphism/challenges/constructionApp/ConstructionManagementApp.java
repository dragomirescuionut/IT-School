package session12_polymorphism.challenges.constructionApp;

import java.util.UUID;

public class ConstructionManagementApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Juan", UUID.randomUUID(), Role.ADMIN);

    }

}
