package session3_javaOperators.challenges;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();
        System.out.println("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();
        int result = byte1 + byte2;
        System.out.println("The result is: "  + result);
    }
}
