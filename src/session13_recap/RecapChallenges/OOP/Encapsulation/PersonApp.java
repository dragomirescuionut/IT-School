package session13_recap.RecapChallenges.OOP.Encapsulation;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAddress("County Street");
        person1.setAge(34);
        person1.setName("Jonathan");
        person1.setAge(-52);

        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Age: " + person1.getAge());
    }
}