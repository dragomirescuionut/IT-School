package session14.Challenges.LinkedList;

import java.util.LinkedList;

public class Challenges1to5 {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        states.add("Florida");
        states.add("California");
        states.add("Texas");

        System.out.println("1.  Write a Java program to append the specified element to the end of a linked list: ");
        System.out.println(addElementToEndOfList(states, "Michigan"));

        System.out.println("\n2. Write a Java program to iterate through all elements in a linked list: ");
        printLinkedList(states);

        System.out.println("\n3.  Write a Java program to iterate through all elements in a linked list starting at the specified position: ");
        printListFromSpecificIndex(states, 1);

        System.out.println("\n4. Write a Java program to iterate a linked list in reverse order. ");
        printReversedList(states);

        System.out.println("\n5. Write a Java program to insert the specified element at the specified position in the linked list. ");
        addElementAtSpecifiedIndex(states, 2, "Arizona");
        printLinkedList(states);
    }

    public static void addElementAtSpecifiedIndex(LinkedList<String> list, int index, String element) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, element);
        } else {
            System.out.println("Please enter a valid index!");
        }
    }

    public static void printReversedList(LinkedList<String> list) {
        for (int index = list.size() - 1; index >= 0; index--) {
            System.out.print(list.get(index) + ", ");
        }
    }

    public static void printListFromSpecificIndex(LinkedList<String> list, int startingIndex) {
        if (startingIndex <= list.size() && startingIndex >= 0) {
            for (int index = startingIndex; index < list.size(); index++) {
                System.out.print(list.get(index) + " , ");
            }
        } else {
            System.out.println("Please enter a valid index!");
        }

    }

    public static LinkedList<String> addElementToEndOfList(LinkedList<String> list, String elementToAdd) {
        list.add(elementToAdd);
        return list;
    }

    public static void printLinkedList(LinkedList<String> list) {
        for (String elem : list) {
            System.out.print(elem + ", ");
        }
    }
}