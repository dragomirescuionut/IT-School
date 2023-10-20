package session13_recap.recapChallenges.lists;

import java.util.ArrayList;
import java.util.List;

public class ListCreation {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");
        myList.add("Element 4");

        for (String elem : myList) {
            System.out.println(elem);
        }
    }
}