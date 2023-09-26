package session4_javaOperatorsAndLoops.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenges5to10 {

    public static void main(String[] args) {
        System.out.println("--- Challenge 6: ---");
        int temperature = -30;
        temperatureCheck(temperature);
        System.out.println("--- Challenge 7: ---");
        double side1 = 5.32;
        double side2 = 4.54;
        double side3 = 5.32;
        checkTypeOfTriangle(side1, side2, side3);
        System.out.println("--- Chalenge 8: ---");
        int number = 4;
        printFactorial(number);
        System.out.println("--- Chalenge 9: ---");
        String countryOne = "USA";
        String countyTwo = "USA";
        String countryThree = "UK";
        System.out.println("Both strings have the USA value: ");
        checkIfTwoStringsAreEqual(countyTwo, countryOne);
        System.out.println("The second string has the UK value: ");
        checkIfTwoStringsAreEqual(countyTwo, countryThree);
        System.out.println("--- Chalenge 10: ---");
        createArrayLists();

    }

    public static void temperatureCheck(int temp) {
        if (temp > 30) {
            System.out.println("Hot. ");
        } else if (temp <= 30 && temp >= 20) {
            System.out.println("Warm");
        } else if (temp >= 0 && temp < 20) {
            System.out.println("Cold");
        } else {
            System.out.println("Very cold");
        }
    }

    public static void checkTypeOfTriangle(double side1, double side2, double side3) {
        String triangleType = (side1 != side2 && side2 != side3 && side3 != side1) ? "Scalane"
                : (side1 == side2 && side2 == side3) ? "Equilateral" : "Isosceles";
        System.out.println("The triangle is: " + triangleType);
    }

    public static void printFactorial(int number) {
        if (number == 0) {
            System.out.println("Please enter a positive number! ");
        } else if (number == 1 || number == 0) {
            System.out.println(number + "!" + "=" + "1");
        } else {
            int factorial = 1;
            for (int index = 1; index <= number; index++) {
                factorial *= index;
            }
            System.out.println(number + " factorial is: " + factorial);
        }
    }

    public static void checkIfTwoStringsAreEqual(String str1, String str2) {
        System.out.println(str1.equals(str2));
    }

    public static void createArrayLists() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("Item 1");
        list1.add("Item 2");
        list1 = list2;
        list1.add("Item 3");
        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);
    }
}