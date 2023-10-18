package session14.Challenges.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenges16to20 {
    public static void main(String[] args) {
        ArrayList<String> monthsList = new ArrayList<>();
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("December");
        monthsList.add("May");
        printList(monthsList);

        System.out.println("\n16. Write a Java program to clone an array list to another array list. ");
        ArrayList<String> clonedMonthsList = cloneList(monthsList);
        System.out.println("Cloned list: " + clonedMonthsList);

        System.out.println("\n17. Write a Java program to empty an array list: ");
        emptyArrayList(clonedMonthsList);
        printList(clonedMonthsList);

        System.out.println("\n18. Write a Java program to test if an array list is empty or not: ");
        System.out.println("Is months list empty? " + isArrayListEmpty(monthsList));
        System.out.println("Is months list copy empty? " + isArrayListEmpty(clonedMonthsList));

        System.out.println("\n19. Write a Java program to increase the size of an array list: ");
        increaseArrayListSize(monthsList, "April");
        printList(monthsList);

    }

    public static void increaseArrayListSize(ArrayList<String> list, String elementToAdd) {
        list.add(elementToAdd);
    }

    public static boolean isArrayListEmpty(ArrayList<String> list) {
        return list.isEmpty();
    }

    public static void emptyArrayList(ArrayList<String> list) {
        list.clear();
        System.out.println("The list has been emptied: " + list.isEmpty());
    }

    public static ArrayList<String> cloneList(ArrayList<String> list) {
        ArrayList<String> clonedList = new ArrayList<>(list);
        return clonedList;
    }

    public static void printList(ArrayList<String> list) {
        for (String elem : list) {
            System.out.print(elem + ", ");
        }
    }
}