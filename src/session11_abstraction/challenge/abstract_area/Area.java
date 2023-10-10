package session11_abstraction.challenge.abstract_area;

public class Area extends Shape {
    @Override
    void RectangleArea(double length, double width) {
        System.out.println("The area of a rectangle with length: " + length + " and width: " + width + " is: " + (length * width));
    }

    @Override
    void SquareArea(double side) {
        System.out.println("The area of a square with a side: " + side + " is: " + (side * side));
    }

    @Override
    void CircleArea(double radius) {
        System.out.println("The area of a circle with radius: " + radius + " is: " + (radius * radius * 3.14));
    }
}