package session11_abstraction.challenge.abstract_animal;

public class AnimalsApp {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        Dogs dog1 = new Dogs();

        cat1.cats();
        dog1.dogs();
    }
}