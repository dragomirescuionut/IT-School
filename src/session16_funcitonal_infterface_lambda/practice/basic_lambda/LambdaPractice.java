package session16_funcitonal_infterface_lambda.practice.basic_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMulti = (a, b) -> a * b;

        System.out.println("Sum: " + getSum.sum(2, 3));
        System.out.println("Multi: " + getMulti.multiply(2, 3));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        names.forEach(name -> System.out.println(name));
    }
}