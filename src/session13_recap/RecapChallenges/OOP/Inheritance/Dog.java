package session13_recap.RecapChallenges.OOP.Inheritance;

public class Dog extends Animal {
    private String bread;
    private String size;

    public void bark() {
        System.out.println("Dog named: " + getName() + " having " + getAge() + " years old, is barking! ");
    }

    public void fetch() {
        System.out.println("Dog named: " + getName() + " having " + getAge() + " years old, is fetching! ");
    }

    public Dog(String name, int age, String species, String bread, String size) {
        super(name, age, species);
        this.bread = bread;
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public String getSize() {
        return size;
    }
}