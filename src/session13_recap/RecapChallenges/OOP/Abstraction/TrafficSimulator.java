package session13_recap.RecapChallenges.OOP.Abstraction;

public class TrafficSimulator {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        car.start();
        car.accelerate();
        car.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        truck.start();
        truck.accelerate();
        truck.stop();
    }
}