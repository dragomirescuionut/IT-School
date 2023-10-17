package session13_recap.RecapChallenges.OOP.Animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bob", "dog", "woof");
        animal1.makeSound();
        animal1.displayDetails();
    }
}