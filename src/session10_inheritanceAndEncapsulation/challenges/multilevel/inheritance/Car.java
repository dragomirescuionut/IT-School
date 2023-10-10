package session10_inheritanceAndEncapsulation.challenges.multilevel.inheritance;

public class Car {
    private String make;
    private String model;
    private int year;

    public void start() {
        System.out.println("The car has started");
    }

    public void stop() {
        System.out.println("The car was stopped");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}
