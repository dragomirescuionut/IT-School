package session5_advancedFlowControl.challenges;

import java.util.Scanner;

public class FibonnaciSeriesGenerator {
    public static void main(String[] args) {
        fibonacciSeriesGenerator();

    }

    public static void fibonacciSeriesGenerator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit: ");
        int limitNumber = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        while (firstNumber < limitNumber) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}