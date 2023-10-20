package session13_recap.recapChallenges.lists;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(12);
        integerList.add(3);
        integerList.add(28);
        integerList.add(12);

        Integer[] integerArray = integerList.toArray(new Integer[0]);
        System.out.println("Integer list: ");
        for (int index = 0; index < integerList.size(); index++) {
            System.out.print(integerArray[index] + " ");
        }
    }
}