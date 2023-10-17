package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSearching {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("tomato");
        stringList.add("carrot");
        findString(stringList);
    }

    public static void findString(List<String> stringList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to search for: ");
        String searchedString = scanner.nextLine();

        if (stringList.contains(searchedString)) {
            System.out.println("String found at position nr: " + stringList.indexOf(searchedString));
        }
        else {
            System.out.println("String not found! ");
        }
        scanner.close();
    }
}