package session13_recap.RecapChallenges.OOP.Car;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void startCar() {
        System.out.println("The car's engine has started! ");
    }

    public void stopCar() {
        System.out.println("The car's engine has stopped! ");
    }

    public void accelerate() {
        System.out.println("The car is accelerating! ");
    }

    public void braking() {
        System.out.println("The car is braking! ");
    }
    public void displayCarDetails(){
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}