package session4_javaOperatorsAndLoops.challenges;

public class Challenges1To5 {

    public static void main(String[] args) {
        System.out.println("---Challenge 1 :---");
        String str1 = "OpenAI";
        String str2 = "OpenAI";
        compareString(str1, str2);

        System.out.println("---Challenge 2 :---");
        int firstNumber = 5;
        int secondNumber = 10;
        String firstString = "String to Compare";
        String secondString = "String toCompare";
        System.out.println("Are the ints equal? " + compareTwoInts(firstNumber, secondNumber));
        System.out.println("Are the strings equal " + compareTwoStrings(firstString, secondString));

        System.out.println("---Challenge 3 :---");
        int myAge = 20;
        adultCheck(myAge);

        System.out.println("---Challenge 4 :---");
        int heightOne = 178;
        int heightTwo = 180;
        System.out.println("The maximum height is: " + findMaximumHeight(heightOne, heightTwo));

        System.out.println("---Challenge 5 :---");
        printNumbersUpTo10();

    }

    public static void compareString(String string1, String string2) {
        boolean haveTheSameReference = (string1 == string2);
        boolean haveSameValue = string1.equals(string2);

        System.out.println("Do the strings have the same object reference? " + haveTheSameReference);
        System.out.println("Do the strings have the same value? " + haveSameValue);
    }

    public static boolean compareTwoInts(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean compareTwoStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void adultCheck(int age) {
        if (age >= 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am not an adult");
        }
    }

    public static int findMaximumHeight(int height1, int height2) {
        int maximumHeight = (height1 > height2) ? height1 : height2;
        return maximumHeight;
    }

    public static void printNumbersUpTo10() {
        System.out.println("Printing numbers between 1 and 10: ");
        for (int index = 0; index <= 10; index++) {
            System.out.print(index + " ");

        }
        System.out.println("\nPrinting even numbers between 1 and 10:");
        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
    }
}