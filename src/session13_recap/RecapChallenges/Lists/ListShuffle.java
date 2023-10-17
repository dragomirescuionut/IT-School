package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShuffle {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList();
        numbersList.add(23);
        numbersList.add(4);
        numbersList.add(9);
        numbersList.add(47);
        numbersList.add(14);
        numbersList.add(76);
        numbersList.add(98);
        numbersList.add(1);
        numbersList.add(24);
        numbersList.add(65);

        System.out.println("The list before the shuffle: " + numbersList);
        Collections.shuffle(numbersList);
        System.out.println("The shuffled list: " + numbersList);
    }
}