package session5_advancedFlowControl.challenges;

import java.util.Scanner;

public class ContinueStatementChallenge {
    public static void main(String[] args) {
        sumOfNumsGreaterThan5();

    }

    public static void sumOfNumsGreaterThan5() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Please enter " + (10 - index) + " more numbers: ");
            int number = scanner.nextInt();
            if (number <= 5) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is: " + sum);

    }
}