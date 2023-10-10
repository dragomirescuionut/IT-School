package session10_inheritanceAndEncapsulation.challenges.multilevel.inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    public void charge() {
        System.out.println("Start charging");
    }
}