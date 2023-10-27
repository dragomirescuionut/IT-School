package session16_funcitonal_infterface_lambda.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<String> monthList = new ArrayList<>(List.of("may", "june", "augst", "november"));
        System.out.println("Original list: " + monthList);
        monthList.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list in alphabetical order: " + monthList);
    }
}