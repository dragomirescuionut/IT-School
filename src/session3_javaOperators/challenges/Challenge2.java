package session3_javaOperators.challenges;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        incrementAndDecrement();
    }

    public static void incrementAndDecrement() {
        int yourNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        yourNumber = scanner.nextInt();
        System.out.println("How many times do you want to increment and decrement your number? ");
        int nrOfOperations = scanner.nextInt();
        int initialValue = yourNumber;
        for (int i = 0; i < nrOfOperations; i++) {
            yourNumber++;
            System.out.println("Incremented: " + yourNumber);
        }
        for (int i = 0; i < nrOfOperations; i++) {
            initialValue--;
            System.out.println("Decremented: " + initialValue);
        }
    }
}
