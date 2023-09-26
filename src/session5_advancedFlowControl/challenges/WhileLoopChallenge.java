package session5_advancedFlowControl.challenges;

import java.util.Scanner;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        printSum();
    }

    public static void printSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int myNumber = 0;
        System.out.println("Enter a number except -1. Enter -1 to stop and print the sum: ");
        while (myNumber != -1) {
            sum += myNumber;
            myNumber = scanner.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}