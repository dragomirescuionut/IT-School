package session16_funcitonal_infterface_lambda.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 4, 5, 12, 54, 29));
        List<Integer> evenNumbers = filterEvenNumbers(list);
        System.out.println(evenNumbers);
    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbersList) {
        return numbersList.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }
}