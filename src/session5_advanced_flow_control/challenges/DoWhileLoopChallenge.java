package session5_advanced_flow_control.challenges;

import java.util.Scanner;

public class DoWhileLoopChallenge {
    public static void main(String[] args) {
        numberGuesser();
    }

    public static void numberGuesser() {
        int predefinedNumber = 3;
        int guessedNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Guess the number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber < predefinedNumber) {
                System.out.println("Higher! ");
            } else {
                System.out.println("Lower! ");
            }
        }
        while (predefinedNumber != guessedNumber);
        System.out.println("Congrats! You guessed the number! ");
    }

}