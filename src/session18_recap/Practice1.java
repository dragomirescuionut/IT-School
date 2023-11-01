package session18_recap;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String sentence = "Today is Halloween";

        long counter = Arrays.stream(sentence.split(" "))
                .filter(word -> word.length() > 3)
                .count();
        System.out.println(counter);
    }
}