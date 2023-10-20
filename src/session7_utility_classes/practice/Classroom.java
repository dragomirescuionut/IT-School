package session7_utility_classes.practice;

public class Classroom {
    public static void main(String[] args) {
        Student studentJohn = new Student();
        studentJohn.name = "John";
        studentJohn.age = 21;
        studentJohn.displayDetails();
        Student studentAlice = new Student();
        studentAlice.age = 20;
        studentAlice.name = "Alice";
        studentAlice.displayDetails();


    }
}
