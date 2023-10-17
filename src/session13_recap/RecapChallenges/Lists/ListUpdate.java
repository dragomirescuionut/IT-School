package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListUpdate {
    public static void main(String[] args) {
        List<Integer> examScores = new ArrayList<>();
        examScores.add(90);
        examScores.add(85);
        examScores.add(78);
        examScores.add(88);
        examScores.add(92);

        System.out.println("The list before the updated: " + examScores);
        examScores.set(2, 95);
        System.out.println("The updated list: " + examScores);
    }
}