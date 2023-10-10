package session11_abstraction.challenge.abstract_area;

public class CalculateAreaApp {
    public static void main(String[] args) {
        Area area = new Area();

        area.CircleArea(12);
        area.SquareArea(5);
        area.RectangleArea(10, 6);
    }
}