package session3.challenges;

import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int myInt = scanner.nextInt();
        int incrementedInt = myInt + 1;
        System.out.println("After incrementing by 1: " + incrementedInt);
        int decrementedInt = myInt - 1;
        System.out.println("After decrementing by 1: " + decrementedInt);

    }
}
