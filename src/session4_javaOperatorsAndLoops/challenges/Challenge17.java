/// Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername
// and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:
//If both hasUsername and hasPassword are true, print "Authentication successful".
//If either hasUsername or hasPassword is false, print "Authentication failed".
//If hasUsername is true but hasPassword is false, print "Password is incorrect".

package session4_javaOperatorsAndLoops.challenges;

import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        checkUsrNameAndPass();
    }

    public static void checkUsrNameAndPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a boolean value for username: ");
        boolean hasUsername = scanner.nextBoolean();
        System.out.println("Please enter a boolean value for password: ");
        boolean hasPassword = scanner.nextBoolean();

        if (hasUsername && hasPassword) {
            System.out.println("Authentication succesful!");
        } else if (hasUsername || !hasPassword) {
            System.out.println("Password is incorrect! ");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}