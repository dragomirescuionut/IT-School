package session13_recap.RecapChallenges.LoopsAndFlowControl;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0) {
            System.out.println("Please enter a positive number! ");
        } else {
            int factorial = 1;
            for (int index = 1; index <= number; index++) {
                factorial *= index;
            }
            System.out.println("The factorial of " + number + " is " + factorial );
        }
    }
}