package session16_funcitonal_infterface_lambda.challenges.functional_interfaces_challenges.find_item_in_list;

import java.util.List;

public class ListContainsTest {
    public static void main(String[] args) {
        List<String> cities = List.of("New York", "Amsterdam", "Bucharest", "Dublin");
        ListContains<String> contains = (list, element) -> list.contains(element);
        String elemToFind = "New York";
        boolean result = contains.isElementInList(cities, elemToFind);
        System.out.println("Was " + elemToFind + " found in the list? " + result);
    }
}