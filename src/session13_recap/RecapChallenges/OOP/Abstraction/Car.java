package session13_recap.RecapChallenges.OOP.Abstraction;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("The car has started! ");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped! ");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating! ");
    }
}