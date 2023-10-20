package session10_inheritance_and_encapsulation.challenges.animals;

public class TestAnimal {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        Cat tom = new Cat();
        Wolf wolf = new Wolf();

        snoopy.sound();
        tom.sound();
        wolf.sound();
    }
}