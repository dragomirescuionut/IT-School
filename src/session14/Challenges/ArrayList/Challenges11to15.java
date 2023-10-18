package session14.Challenges.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Challenges11to15 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = populateList();
        ArrayList<Integer> newListTwo = populateList();
        printList(newList);
        System.out.println("\n11. Write a Java program to reverse elements in a array list: ");
        reverseArrayList(newList);

        System.out.println("\n12. Write a Java program to extract a portion of a array list: ");
        extractPortionOfArray(newList, 0, 3);

        System.out.println("\n13. Write a Java program to compare two array lists: ");
        System.out.println("Are the list equal? : " + compareToArrays(newList, newListTwo));

        System.out.println("\n14. Write a Java program of swap two elements in an array list: ");
        swapTwoElements(newList, 0, 4);

        System.out.println("\n15. Write a Java program to join two array lists. ");
        System.out.println("Joined array list: " + joinTwoLists(newList, newListTwo));
    }

    public static List<Integer> joinTwoLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        List<Integer> joinedList = new ArrayList<Integer>();
        joinedList.addAll(listOne);
        joinedList.addAll(listTwo);
        return joinedList;
    }

    public static void swapTwoElements(ArrayList<Integer> list, int firstIndex, int secondIndex) {
        if (firstIndex >= 0 && firstIndex < list.size() && secondIndex >= 0 && secondIndex < list.size() && secondIndex != firstIndex) {
            int firstElem = list.get(firstIndex);
            int secondElem = list.get(secondIndex);

            list.set(firstIndex, secondElem);
            list.set(secondIndex, firstElem);
            System.out.println("Array after swapping : " + list);
        } else {
            System.out.println("Invalid indexes! ");
        }
    }

    public static boolean compareToArrays(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        return listOne.equals(listTwo);
    }

    public static void extractPortionOfArray(ArrayList<Integer> list, int startIndex, int endIndex) {
        List<Integer> subList = new ArrayList<>();
        if (startIndex >= 0 && endIndex >= 0 && startIndex <= endIndex) {
            subList = list.subList(startIndex, endIndex);
            System.out.println("A portion of the array is: " + subList);
        } else {
            System.out.println("Not valid indexes! ");
        }

    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int index = list.size() - 1; index >= 0; index--) {
            reversedList.add(list.get(index));
        }
        System.out.println("Reversed list is: " + reversedList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int elem : list) {
            System.out.print(elem + ", ");
        }
    }

    public static ArrayList<Integer> populateList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int index = 10; index < 20; index++) {
            integerList.add(index);
        }
        return integerList;
    }
}