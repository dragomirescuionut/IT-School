package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
    reverseList();
    }
    public static void reverseList(){
        List<Integer>numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(15);
        numberList.add(23);
        numberList.add(8);
        System.out.println("Original order: " + numberList);
        Collections.reverse(numberList);
        System.out.println("Reverse order: " + numberList);
    }
}