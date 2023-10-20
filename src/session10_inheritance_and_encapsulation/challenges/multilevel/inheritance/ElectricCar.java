package session10_inheritance_and_encapsulation.challenges.multilevel.inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    public void charge() {
        System.out.println("Start charging");
    }
}