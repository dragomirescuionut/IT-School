package session13_recap.recapChallenges.oop.Abstraction;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("The motorcycle has started!");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle has stopped! ");
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle is accelerating! ");
    }
}