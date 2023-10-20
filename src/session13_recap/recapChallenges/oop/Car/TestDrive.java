package session13_recap.recapChallenges.oop.Car;

public class TestDrive {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corola", 2007, "white");
        car1.startCar();
        car1.accelerate();
        car1.braking();
        car1.stopCar();
        car1.displayCarDetails();
    }
}