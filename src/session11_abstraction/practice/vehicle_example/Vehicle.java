package session11_abstraction.practice.vehicle_example;

public abstract class Vehicle {
    int speed;
    abstract void accelerate();
    void retractableHood(){
        System.out.println("Hood on/off");
    }
}
