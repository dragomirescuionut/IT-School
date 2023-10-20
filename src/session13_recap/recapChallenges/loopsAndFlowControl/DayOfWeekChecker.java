package session13_recap.recapChallenges.loopsAndFlowControl;

import java.util.Scanner;

public class DayOfWeekChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day of the week! ");
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a week day! ");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's a weekend day! ");
                break;
            default:
                System.out.println("Please enter a valid day! ");
        }
        scanner.close();
    }
}

