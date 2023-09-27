package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");

        names.add(0, "Johnutz");

        System.out.println(names);
        if(names.isEmpty()){
            System.out.println("name list is empty");
        }else {
            System.out.println("names list is not empty, size: " + names.size());
        }

        String firstElement = names.get(0);
        System.out.println("First element from names: " + firstElement);
    }
}
