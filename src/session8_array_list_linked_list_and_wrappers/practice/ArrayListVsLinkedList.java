package session8_array_list_linked_list_and_wrappers.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 50000; index++) {
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        //timer for ArrayList
        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            arrayList.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();

        //time for Linked List
        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList: " + (endTimerArrayList - startTimerArrayList));
        System.out.println("LinkedList: " + (endTimerLinkedList - startTimerLinkedList));
    }
}
