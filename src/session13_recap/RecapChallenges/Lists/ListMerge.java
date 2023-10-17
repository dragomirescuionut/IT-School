package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {
    public static void main(String[] args) {
        List<String> stringListOne = new ArrayList<>();
        stringListOne.add("Apple");
        stringListOne.add("Banana");
        stringListOne.add("Orange");
        stringListOne.add("Grapes");

        List<String> stringListTwo = new ArrayList<>();
        stringListTwo.add("Mango");
        stringListTwo.add("Cherry");
        stringListTwo.add("Pineapple");
        stringListTwo.add("Strawberry");

        List<String> mergedList = new ArrayList<>(stringListOne);
        mergedList.addAll(stringListTwo);
        System.out.println("Merged List: " + mergedList);
    }
}