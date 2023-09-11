package session3.challenges;

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println();
        double area = areaCalculator(width, length);
        System.out.println("The area of the rectangle is: " + area);

    }

    public static double areaCalculator(double width, double length) {
        return width * length;


    }
}
