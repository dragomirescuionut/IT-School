package session3_javaOperators.challenges;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first boolean value: ");
        boolean boolean1 = scanner.nextBoolean();
        System.out.println("Enter the second boolean value: ");
        boolean boolean2 = scanner.nextBoolean();
        boolean result1 = !boolean1;
        boolean result2 = !boolean2;
        System.out.println("The result for the first value is: " + result1);
        System.out.println("The result for the second value is: " + result2);
    }
}
