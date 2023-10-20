package session13_recap.recapChallenges.oop.Polymorphism;

public class Circle extends Shape {
    private double radius;

    @Override
    double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}