package session12_polymorphism.practice.has_a;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        System.out.println("The car is going");
    }

    void start(){
        engine.start();
    }
}