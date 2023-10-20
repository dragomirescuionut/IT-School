package session5_advanced_flow_control.challenges;

import java.util.Scanner;

public class JumpStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        optionsMenu();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                printHelloWorld();
                break;
            case 2:
                printYourName();
            case 3:
                exitProgram(scanner);
                break;
            default:
                System.out.println("Please enter a valid choice! ");

        }
    }

    public static void optionsMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print 'Hello World'");
        System.out.println("2. Print your name");
        System.out.println("3. Exit");
        System.out.println("Chose one of the following options: ");
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String yourName = scanner.next();
        System.out.println("Your name is " + yourName);

    }

    public static void exitProgram(Scanner scan) {
        System.out.println("Exiting the program! ");
        scan.close();
    }
}
