package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddition {
    public static void main(String[] args) {
        printList();
    }

    public static void printList() {
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an element in the list. Enter a non-int value to stop: ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numberList.add(number);
        }
        System.out.println("Your list is: ");
        for (int number : numberList) {
            System.out.print(number + " ");
        }
    }
}