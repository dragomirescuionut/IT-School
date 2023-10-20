package session14.Challenges.LinkedList;

import java.util.LinkedList;



public class Challenges6to10 {
    public static void main(String[] args) {
        LinkedList<String> chocolates = new LinkedList<String>();
        chocolates.add("Milka");
        chocolates.add("Bounty");
        chocolates.add("Milky Way");

        System.out.println("6.  Write a Java program to insert elements into the linked list at the first and last position: ");
        insertFirstAndLast(chocolates, "Africana", "Toblerone");

        System.out.println("7. Write a Java program to insert elements into the linked list at the first and last position: ");
        System.out.println(insertAtFirstPosition(chocolates, "Kit Kat"));


        System.out.println("8. Write a Java program to insert elements into the linked list at the first and last position: ");
        System.out.println(insertAtLastPosition(chocolates, "Kit Kat"));

        System.out.println("9.  Write a Java program to insert some elements at the specified position into a linked list: ");
        System.out.println(insertAtSpecifiedPosition(chocolates, 1, "Primola"));

        System.out.println("10.  Write a Java program to get the first and last occurrence of the specified elements in a linked list: ");
        getFirstAndLastOccurrence(chocolates,"Kit Kat");


    }
    public static LinkedList<String> getFirstAndLastOccurrence(LinkedList<String>list, String elementToFind){
        int firstOccurrence = list.indexOf(elementToFind);
        int lastOccurrence = list.lastIndexOf(elementToFind);
        if( firstOccurrence != -1 && lastOccurrence != -1){
            System.out.println("First occurence of " + elementToFind + "is at index: " + firstOccurrence + " and last: " + lastOccurrence);
        }
        else{
            System.out.println("Element not found!");
        }
        return list;
    }
    public static LinkedList<String> insertAtSpecifiedPosition(LinkedList<String> list, int index, String element){
        if(index >= 0 && index < list.size()){
            list.add(index,element);
        }
        else {
            System.out.println("Please enter a valid index! ");
        }
        return list;
    }

    public static LinkedList<String> insertAtLastPosition(LinkedList<String> list, String element) {
        list.add(list.size(), element);
        return list;
    }

    public static LinkedList<String> insertAtFirstPosition(LinkedList<String> list, String element) {
        list.add(0, element);
        return list;
    }

    public static LinkedList<String> insertFirstAndLast(LinkedList<String> list, String firstElement, String lastElement) {
        list.addFirst(firstElement);
        list.addLast(lastElement);
        return list;
    }

}