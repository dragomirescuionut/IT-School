package session5.challenges;

import java.util.Scanner;

public class BreakStatementChallenge {
    public static void main(String[] args) {
        averageOfNumbers();
    }

    public static void averageOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int yourNumber;
        int sum = 0, counter = 0;
        double average;
        while (true) {
            System.out.print("Please enter a number: ");
            yourNumber = scanner.nextInt();
            sum += yourNumber;

            if (yourNumber == 0) {
                break;
            }
            counter++;
        }
        average = sum / counter;
        System.out.println("The average is: " + average);
    }
}
