package session13_recap.recapChallenges.oop.Shape;

public class ShapeApp {
    public static void main(String[] args) {
        Shape square = new Shape("Square", 5, 5);
        Shape rectangle = new Shape("Rectangle", 3, 5);

        System.out.println(square.getShapeName() + " area: " + square.calculateArea());
        System.out.println(square.getShapeName() + " perimeter: " + square.calculatePerimeter());

        System.out.println(rectangle.getShapeName() + " area: " + rectangle.calculateArea());
        System.out.println(rectangle.getShapeName() + " perimeter: " + rectangle.calculatePerimeter());
    }
}