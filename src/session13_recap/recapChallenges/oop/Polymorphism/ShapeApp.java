package session13_recap.recapChallenges.oop.Polymorphism;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(10,3);
        shapes[1] = new Circle(6.4);
        shapes[2] = new Triangle(4,5);

        for (Shape shape : shapes){
            System.out.println("Area: " + shape.area());
        }
    }
}
