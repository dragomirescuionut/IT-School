package session10_inheritanceAndEncapsulation.practice.inehritance;

public class SuperKeywordExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 24, 34324);
        employee.display();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + "age: " + age);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age); //calling the parent constructor
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}