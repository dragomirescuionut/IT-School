package session10_inheritanceAndEncapsulation.practice.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println("Student age: " + student1.getAge());
        System.out.println("Student name: " + student1.getName());

        student1.setAge(-2);
        System.out.println("Student age after setting it to -2: " + student1.getAge());
    }
}
