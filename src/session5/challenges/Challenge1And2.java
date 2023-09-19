package session5.challenges;

import java.util.Scanner;

public class Challenge1And2 {
    public static void main(String[] args) {
        System.out.println("1. Even or Odd Checker: ");
        evenOrOddChecker();
        System.out.println("2. Month name finder: ");
        monthNameFinder();

    }

    public static void evenOrOddChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int myNumber = scanner.nextInt();
        String oddOrEven = myNumber % 2 == 0 ? "even" : "odd";
        System.out.println(myNumber + " is an " + oddOrEven + " number! ");
    }

    public static void monthNameFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12: ");
        int monthInt = scanner.nextInt();
        String monthString;
        switch (monthInt) {
            case 1 -> monthString = "January";
            case 2 -> monthString = "February";
            case 3 -> monthString = "March";
            case 4 -> monthString = "April";
            case 5 -> monthString = "May";
            case 6 -> monthString = "June";
            case 7 -> monthString = "July";
            case 8 -> monthString = "August";
            case 9 -> monthString = "September";
            case 10 -> monthString = "October";
            case 11 -> monthString = "November";
            case 12 -> monthString = "December";
            default -> monthString = "Invalid month!";
        }
        System.out.println("The month in the string format is: " + monthString);
    }
}