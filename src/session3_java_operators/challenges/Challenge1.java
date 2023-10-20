package session3_java_operators.challenges;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        inputTwoNumbers();

    }

    public static void inputTwoNumbers() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));

    }
}
