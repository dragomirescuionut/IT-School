package session14.Challenges.LinkedList;
import java.util.LinkedList;


public class Challenges11to15 {
    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Michael");

        System.out.println("11. Write a Java program to display the elements and their positions in a linked list. ");
        displayElementAndIndex(users);

        System.out.println("12. Write a Java program to remove a specified element from a linked list: ");
        System.out.println("Element after removing element: " + removeSpecificElement(users, "Bodb"));

        System.out.println("13. Write a Java program to remove first and last element from a linked list: ");
        System.out.println("New list after removing first and last elem: " + removeFirstAndLastElem(users));

        System.out.println("14. Write a Java program to remove all the elements from a linked list.");
        System.out.println("Empty: " + removeAllElement(users));

        users.add("Alice");
        users.add("Bob");
        users.add("Michael");

        System.out.println("15. Write a Java program of swap two elements in a linked list. ");
        swipeElements(users, 0, 2);

    }

    public static void swipeElements(LinkedList<String> list, int indexOne, int indexTwo) {
        if (indexOne >= 0 && indexOne < list.size() && indexTwo >= 0 && indexTwo < list.size() && indexOne != indexTwo) {
            String elementOne = list.get(indexOne);
            String elementTwo = list.get(indexTwo);

            list.set(indexOne, elementTwo);
            list.set(indexTwo, elementOne);

            System.out.println("Swiped list: " + list);
        } else {
            System.out.println("Invalid indexes! ");
        }
    }

    public static LinkedList<String> removeAllElement(LinkedList<String> list) {
        list.clear();
        return list;
    }

    public static LinkedList<String> removeFirstAndLastElem(LinkedList<String> list) {
        String firstElem = list.getFirst();
        String lastElem = list.getLast();

        list.remove(firstElem);
        list.remove(lastElem);
        return list;
    }

    public static LinkedList<String> removeSpecificElement(LinkedList<String> list, String elementToRemove) {
        boolean isFound = false;
        for (String elem : list) {
            if (elem.equals(elementToRemove)) {
                list.remove(elementToRemove);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println(elementToRemove + " was removed! ");
        } else {
            System.out.println(elementToRemove + " was not found and was not removed!");
        }
        return list;
    }

    public static void displayElementAndIndex(LinkedList<String> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println("Element: " + list.get(index) + ", Index: " + index);
        }
    }
}