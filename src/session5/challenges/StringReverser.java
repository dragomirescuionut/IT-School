package session5.challenges;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println("The reversed string is: " + stringReverser());

    }

    public static String stringReverser() {
        String reversedString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String myString = scanner.next();
        char[] ch = myString.toCharArray();
        System.out.println(ch);
        for (int index = ch.length - 1; index >= 0; index--) {
            reversedString += ch[index];
        }
        return reversedString;
    }
}