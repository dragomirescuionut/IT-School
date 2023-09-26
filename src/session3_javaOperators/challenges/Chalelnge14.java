package session3_javaOperators.challenges;

import java.util.Scanner;

public class Chalelnge14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int myNumber = scanner.nextInt();
        if(myNumber>=1 && myNumber<=100){
            System.out.println("Number " + myNumber + "is in the 1-100 range. ");
        }
        else {
            System.out.println("Number " + myNumber + " is NOT in the 1-100 range. ");
        }
    }
}
