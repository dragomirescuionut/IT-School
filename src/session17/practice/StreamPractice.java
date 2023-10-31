package session17.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "peach", "watermelon");
        List<Product> productsList = Arrays.asList(
                new Product("Lenovo Laptop", 4999.9),
                new Product("Phone", 999.99),
                new Product("Smart Watch", 245));
        List<List<Integer>> listsOfList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                Arrays.asList(1, 6, 3, 2, 6, 5, 7));

        printEvenNumbers(numbers);
        printEvenNumbersWithStream(numbers);
        printStringByLengthBiggerThan(strings, 5);
        printProductPrices(productsList);
        printProductIncreasedPrices(productsList);

        printFlatMap(listsOfList);
        printSortedProductsList(productsList);

        printProcessedNumbers(numbers);

        boolean anyMatch = strings.stream()
                .filter(fruit -> fruit.length() > 5)
                .anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println(anyMatch);
    }

    private static void printProcessedNumbers(List<Integer> integerList) {
        integerList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .filter(number -> number > 20)
                .forEach(System.out::println);

    }

    private static void printSortedProductsList(List<Product> productList) {
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProducts.forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    private static void printSumOfNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers:" + sum);
    }

    private static void printFlatMap(List<List<Integer>> listsOfList) {
        List<Integer> flattenedList = listsOfList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flatted list:" + flattenedList);
    }

    private static void printProductIncreasedPrices(List<Product> productList) {
        List<String> formattedPrices = productList.stream()
                .map(product -> product.getPrice() * 1.10)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println("Increased prices" + formattedPrices);
    }

    private static void printProductPrices(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(System.out::println);
    }

    private static void printStringInteger(List<String> stringList) {
        List<Integer> resultList = stringList.stream()
                .map(String::length)
                .toList();
    }

    private static void printStringByLengthBiggerThan(List<String> inputList, int minLnegth) {
        List<String> filteredString = new ArrayList<>();
        for (String element : inputList) {
            if (element.length() > minLnegth) {
                filteredString.add(element);
            }
        }
        System.out.println("Traditional approach: " + filteredString);
        List<String> filtredStringsLambda = inputList.stream()
                .filter(element -> element.length() > minLnegth)
                .toList();
        System.out.println("Stream approach: " + filtredStringsLambda);
    }

    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        //stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStream);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        //traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional aproach: " + evenNumbers);
    }
}