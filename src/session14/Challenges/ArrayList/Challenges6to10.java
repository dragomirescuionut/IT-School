package session14.Challenges.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenges6to10 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = populateList();
        printList(integerList);

        System.out.println("\n6. Write a Java program to remove the third element from a array list: ");
        removeThirdElem(integerList);
        printList(integerList);

        System.out.println("\n7. Write a Java program to search an element in a array list: ");
        searchElement(integerList, 1);

        System.out.println("\n8. Write a Java program to sort a given array list: ");
        Collections.shuffle(integerList);
        printList(integerList);
        System.out.println("\nSorted list: " + sortArrayList(integerList));

        System.out.println("\n9.Write a Java program to copy one array list into another: ");
        System.out.println("The copied list: " + copyArrayList(integerList));

        System.out.println("\n10. Write a Java program to shuffle elements in a array list: ");
        System.out.println(shuffleArayList(integerList));
    }

    public static List<Integer> shuffleArayList(ArrayList<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

    public static List<Integer> copyArrayList(ArrayList<Integer> list) {
        List<Integer> copiedArray = new ArrayList<>(list);
        return copiedArray;
    }

    public static List<Integer> sortArrayList(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public static void searchElement(ArrayList<Integer> list, int elementToFind) {
        for (int elem : list) {
            if (elem == elementToFind) {
                System.out.println("The element was found at index: " + elem);
            }
        }
    }

    public static void removeThirdElem(ArrayList<Integer> list) {
        int thirdElem = list.get(2);
        list.remove(thirdElem);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int elem : list) {
            System.out.print(elem + ", ");
        }
    }

    public static ArrayList<Integer> populateList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            integerList.add(index);
        }
        return integerList;
    }
}