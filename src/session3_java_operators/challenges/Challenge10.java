package session3_java_operators.challenges;

import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = -number;
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
