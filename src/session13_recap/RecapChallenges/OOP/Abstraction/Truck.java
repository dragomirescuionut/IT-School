package session13_recap.RecapChallenges.OOP.Abstraction;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("The truck has started!");
    }

    @Override
    public void stop() {
        System.out.println("The truck has stopped!");
    }

    @Override
    public void accelerate() {
        System.out.println("The truck is accelerating");
    }
}