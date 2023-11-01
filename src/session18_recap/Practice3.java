package session18_recap;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = Arrays.asList(4, 6, 1, 656, 878, 98, 5, 65, 76, 6);
        printMinAndMax(randomNumbers);

    }

    private static void printMinAndMax(List<Integer> list) {
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Min: " + min.getAsInt() + " max: " + max.getAsInt());
    }
}