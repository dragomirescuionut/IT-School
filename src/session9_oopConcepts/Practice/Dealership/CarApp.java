package session9_oopConcepts.Practice.Dealership;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("VW");
        car1.setModel("Passat");
        car1.setSpeed(50);

        System.out.println(car1);
//        System.out.println("My car brand: " + car1.getBrand());

        car1.accelerate();
        car1.accelerate();
        System.out.println("Accelerating two times, speed is: " + car1.getSpeed());
        car1.decelerate();
        System.out.println("Breaking once, speed is: " + car1.getSpeed());
    }
}