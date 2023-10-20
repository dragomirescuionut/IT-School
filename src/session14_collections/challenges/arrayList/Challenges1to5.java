package session14_collections.challenges.arrayList;

import java.util.ArrayList;

public class Challenges1to5 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Red");

        System.out.println("1. Printing all the elements from the list ");
        printStringList(colorList);
        System.out.println("\n2. Iterating through a list: ");
        iterateThroughAList(colorList);

        System.out.println("\n3. Adding an element into the array list at first postion: ");
        addElementAtFirstPosition(colorList, "White");
        System.out.println("New list: ");
        iterateThroughAList(colorList);

        System.out.println("\n4. Retrive an element at a specific index from a given array list: ");
        retriveElement(colorList, 0);

        System.out.println("\n5. Update specific array element from array list: ");
        updateSpecificElement(colorList, 1, "Purple");
    }

    public static void updateSpecificElement(ArrayList<String> list, int replacedElemIndex, String newElem) {
        if (replacedElemIndex >= 0 && replacedElemIndex < list.size()) {
            list.set(replacedElemIndex, newElem);
            System.out.println("Updated color list is: " + list);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void retriveElement(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            String element = list.get(index);
            System.out.println("The elemnt at index: " + index + " is " + element);
        } else {
            System.out.println("Invalid index! ");
        }
    }

    public static void addElementAtFirstPosition(ArrayList<String> list, String elementToBeAdded) {
        list.add(0, elementToBeAdded);
    }

    public static void iterateThroughAList(ArrayList<String> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + ", ");
        }
    }

    public static void printStringList(ArrayList<String> list) {
        for (String elem : list) {
            System.out.print(elem + ", ");
        }
    }
}