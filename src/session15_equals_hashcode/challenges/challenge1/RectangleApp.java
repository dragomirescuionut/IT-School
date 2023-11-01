package session15_equals_hashcode.challenges.challenge1;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 15);
        Rectangle rectangle2 = new Rectangle(10, 15);
        System.out.println("Rectangle 1 equals rectangle 2: " + rectangle1.equals(rectangle2));
        System.out.println("HashCode of rectangle1: " + rectangle1.hashCode());
        System.out.println("HashCode of rectangele2: " + rectangle2.hashCode());
    }
}
