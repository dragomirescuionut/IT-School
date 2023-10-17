package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemoval {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Michael");
        names.add("Johnathan");
        removeElement(names);
    }

    public static void removeElement(List<String> stringList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an element to remove: ");
        String elementToRemove = scanner.nextLine();
        boolean removed = stringList.remove(elementToRemove);
        if (removed) {
            System.out.println("New list: " + stringList);
        } else {
            System.out.println("Element not found! ");
        }
        scanner.close();
    }
}