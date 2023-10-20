package session3_java_operators.challenges;

import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the initial price: ");
        double price = scanner.nextDouble();
        System.out.println("Please enter the discount: ");
        double discountPercentage = scanner.nextDouble() * 100;
        double discountAmt = price * discountPercentage;
        double finalPrice = price - discountAmt;
        System.out.println("The initial price is: " + price);
        System.out.println("The discount percent is: " + discountPercentage);
        System.out.println("The final price is: " + finalPrice);


    }
}
