package session16_funcitonal_infterface_lambda.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 15);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("The sum of the elements in list: " + integers + " is " + sum);
    }
}