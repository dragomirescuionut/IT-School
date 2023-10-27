package session16_funcitonal_infterface_lambda.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("blue", "yellow", "pink", "green"));
        System.out.println("The initial strig is" + colors);

        colors.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("List sorted in alphabetical order: " + colors);
        colors.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("List sorted in reverse order: " + colors);
    }
}