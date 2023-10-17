package session13_recap.RecapChallenges.OOP.Polymorphism;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
}