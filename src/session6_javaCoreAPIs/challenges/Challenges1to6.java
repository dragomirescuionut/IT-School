package session6_javaCoreAPIs.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenges1to6 {
    public static void main(String[] args) {
        System.out.println("--- Challenge 1: ---");
        String str1 = "Hello";
        getReversedString(str1);

        System.out.println("--- Challenge 2: ---");
        String myString = "ANA";
        palindromChecker(myString);

        System.out.println("--- Challenge 3: ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("pear");
        System.out.println("The concatenated List is: " + stringConcatenator(fruits));

        System.out.println("--- Challenge 4: ---");
        String inputString = "Hello world ";
        System.out.println(removeVowels(inputString));

        System.out.println("--- Challenge 5: ---");
        String inputString1 = "My string need to be capitalized.";
        System.out.println("The updated string is: " + capitalizeWords(inputString1));

        System.out.println("--- Challenge 6: ---");
        stringReplacer();

    }

    public static void getReversedString(String myString) {
        StringBuilder str = new StringBuilder(myString);
        System.out.println("Your string is: " + str.toString());
        System.out.println("Your reversed string is: " + str.reverse());
    }

    public static void palindromChecker(String myString) {
        StringBuilder strBuilder = new StringBuilder(myString);
        if (myString.equals(strBuilder.toString())) {
            System.out.println("Your string " + myString + "is a palindrom! ");
        } else {
            System.out.println("Your string is not a palindrom! :( ");
        }
    }

    public static String stringConcatenator(List<String> stringArray) {
        StringBuilder bigString = new StringBuilder();
        for (String elem : stringArray) {
            bigString.append(elem + " ");
        }
        String concatenatedString = bigString.toString();
        return concatenatedString;
    }

    public static String removeVowels(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < inputString.length(); index++) {
            char currentChar = inputString.charAt(index);
            if (!isVowel(currentChar)) {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isVowel(char currentChar) {
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        char currentCharLowerCase = Character.toLowerCase(currentChar);
        for (int index = 0; index < vowelArray.length; index++) {
            if (currentCharLowerCase == vowelArray[index]) {
                return true;
            }
        }
        return false;
    }

    private static String capitalizeWords(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < inputString.length(); index++) {
            if (index == 0 || inputString.charAt(index - 1) == ' ') {
                stringBuilder.append(inputString.toUpperCase().charAt(index));
                continue;
            }
            stringBuilder.append(inputString.charAt(index));
        }
        return stringBuilder.toString();
    }

    private static void stringReplacer() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Please enter the word your want to replace: ");
        String targetWord = scanner.nextLine();
        System.out.println("Please enter the word you want to replace " + targetWord + "with ");
        String newWord = scanner.nextLine();
        String[] splitedSentence = sentence.split(" ");
        System.out.println(splitedSentence);

    }
}