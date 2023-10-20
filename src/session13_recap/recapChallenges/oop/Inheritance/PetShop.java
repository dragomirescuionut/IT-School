package session13_recap.recapChallenges.oop.Inheritance;

public class PetShop {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Woofy", 12, "canine", "pug", "small");
        Dog dog2 = new Dog("GoodBoy", 5, "canine", "Golden Retriver", "large");

        dog1.bark();
        dog1.fetch();
        dog2.fetch();
        dog2.bark();
    }
}