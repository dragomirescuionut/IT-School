package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(28);
        numbers.add(67);
        numbers.add(32);
        numbers.add(124);
        numbers.add(5);
        sortList(numbers);
    }

    public static void sortList(List<Integer> numberList) {
        Collections.sort(numberList);
        System.out.println("The sorted list is: " + numberList);
    }
}