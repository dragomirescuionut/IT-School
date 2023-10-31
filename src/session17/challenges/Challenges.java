package session17.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenges {
    public static void main(String[] args) {
        System.out.println("--- Challenge 1: ---");
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        extractEvenNumbers(numbers);

        System.out.println("--- Challenge 2: ---");
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        printLongestString(strings);

        System.out.println("--- Challenge 3: ---");
        System.out.println("Prim numbers from 1 to 100");
        IntStream.rangeClosed(1, 100)
                .filter(PrimeNumberChecker::isPrime)
                .forEach(num -> System.out.print(num + ", "));

        System.out.println("\n--- Challenge 4: ---");
        List<String> strings2 = Arrays.asList("one", "two", "three", "four");
        concatenateStrings(strings2);

        System.out.println("--- Challenge 5: ---");
        List<Person> personsList = Arrays.asList(new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17),
                new Person("Michael", "Michaelson", 30));
        getAdults(personsList);

        System.out.println("--- Challenge 6: ---");
        Integer[] numbers2 = {1, 2, 3, 4, 5};
        sumOfIntegersInArray(numbers2);

        System.out.println("--- Challenge 7: ---");
        List<String> strings3 = Arrays.asList("Hello", "World", "Java", "Streams");
        printStringLength(strings3);

        System.out.println("\n--- Challenge 8: ---");
        String sentence = "Hello world";
        printNumberOfVowels(sentence);

    }
    public static void printNumberOfVowels(String string){
        long numberOfVowels = string.toLowerCase().chars()
                .filter(character -> "aeiou".indexOf(character) != -1)
                .count();
        System.out.println("Number of vowels: " + numberOfVowels);
    }
    public static void printStringLength(List<String> strings) {
        List<Integer> stringLengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        stringLengths.forEach(length -> System.out.print(length + " , "));
    }

    public static void sumOfIntegersInArray(Integer[] nums) {
        Integer sum = Arrays.stream(nums).toList().stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static void getAdults(List<Person> stringList) {
        List<Person> adults = stringList.stream()
                .filter(person -> person.age > 18)
                .collect(Collectors.toList());
        adults.forEach(person -> System.out.println(person));
    }

    public static void concatenateStrings(List<String> stringList) {
        String concatenatedString = stringList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedString);
    }

    public static void printLongestString(List<String> stringList) {
        String longestString = stringList.stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Longest string from the list is: " + longestString);
    }

    public static void extractEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);
    }
}