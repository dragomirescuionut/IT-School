package session16_funcitonal_infterface_lambda.challenges.functional_interfaces_challenges.filer_odd_numbers;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersTest {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 5, 2, 7, 45, 24, 68);
        OddNumbersFiler oddNumbersFiler = list -> list.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        List<Integer> oddNumbersList = oddNumbersFiler.filterOddNumbers(integerList);

        System.out.println("Initial List: " + integerList);
        System.out.println("List containing only odd numbers: " + oddNumbersList);
    }
}