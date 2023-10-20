package session13_recap.recapChallenges.oop.Shape;

public class Shape {
    private String shapeName;
    private double length;
    private double width;

    public Shape(String shapeName, double length, double width) {
        this.shapeName = shapeName;
        this.length = length;
        this.width = width;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}