package session16_funcitonal_infterface_lambda.challenges.functional_interfaces_challenges.format_name;

import java.util.List;

public class NameFormatterTest {
    public static void main(String[] args) {
        NameFormatter nameToUpper = firstNames -> firstNames.stream()
                .map(String::toUpperCase)
                .toList();
        List<String> firstNames = List.of("Alice", "bob", "david", "michael");
        List<String> formatterFistNames = nameToUpper.formatNames(firstNames);
        System.out.println("Original list: " + firstNames);
        System.out.println("Formatted list: " + formatterFistNames);
    }
}