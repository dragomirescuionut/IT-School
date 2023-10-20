package session14_collections.challenges.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Challenges16to20 {
    public static void main(String[] args) {
        LinkedList<String> daysList = new LinkedList<>();
        daysList.add("Monday");
        daysList.add("Sunday");
        daysList.add("Wednesday");

        System.out.println("16.  Write a Java program to shuffle the elements in a linked list. ");
        Collections.shuffle(daysList);
        System.out.println(daysList);

        System.out.println("17.  Write a Java program to join two linked lists. ");
        LinkedList<String> moreDaysList = new LinkedList<>();
        moreDaysList.add("Friday");
        moreDaysList.add("Saturday");

        joinLinkedLists(daysList, moreDaysList);
        System.out.println("Joined list: " + daysList);

        System.out.println("18. Write a Java program to clone an linked list to another linked list: ");
        LinkedList<String> clonedList = new LinkedList<>(daysList);
        System.out.println(clonedList);

        System.out.println("19.  Write a Java program to remove and return the first element of a linked list. ");
        removeAndReturnFirstElem(clonedList);

        System.out.println("20. Write a Java program to retrieve but does not remove, the first element of a linked list.");
        returnFirstElem(moreDaysList);

    }
    public static void returnFirstElem(LinkedList<String> list){
        System.out.println("The first element in the linked list is: " + list.get(0));
    }
    public static void removeAndReturnFirstElem(LinkedList<String> list) {
        System.out.println("The first element was: " + list.get(0));
        list.remove(0);
        System.out.println("The linked list without that element: " + list);
    }

    public static void joinLinkedLists(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);

    }
}
