package session8_arrayListVsLinkedListAndWrappers.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Challenge1to5 {
    public static void main(String[] args) {

        System.out.println("--- Challenge 1: ---");
        String[] shoppingList = {"Mouse", "Keyboard", "Headphones"};
        printSoppingList(shoppingList);

        System.out.println("\n--- Challenge 2: ---");
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("gift 1");
        wishList.add("gift 2");
        wishList.add("gift 3");
        printChristmasWishlist(wishList);

        System.out.println("\n--- Challenge 3: ---");
        printGraduatedStudents();

        System.out.println("\n--- Challenge 4: ---");
        int[] myArray = {1, 2, 34, 5, 7, 2, 10, 15, 13, 6};
        countEvenAndOddNums(myArray);

        System.out.println("\n--- Challenge 5: ---");
        addCityToList();
    }

    public static void printSoppingList(String[] shoppingList) {
        System.out.print("My shopping list: ");
        for (String elem : shoppingList) {
            System.out.print(elem + " ");
        }
    }

    public static void printChristmasWishlist(ArrayList<String> wishList) {
        System.out.print("My Christmas wishlist: ");
        for (String item : wishList) {
            System.out.print(item + " ");
        }
    }

    public static void printGraduatedStudents() {
        String[] students = {"Aurel", "Alexandru", "Andrei", "Alin", "Bogdan", "Bucur", "Cristian", "Constantin", "Daniel", "Denis"};
        ArrayList<String> studentList = new ArrayList<>();
        populateStudentList(students, studentList);
        ArrayList<String> graduateStudentList = new ArrayList<>();

        //System.out.println("Students before graduation: " + studentList);
        graduateStudentList = (ArrayList<String>) studentList.clone();
        System.out.println("The list of graduated students are: ");
        for (String student : graduateStudentList) {
            System.out.println("- " + student);
        }
    }

    public static void populateStudentList(String[] studentsArray, ArrayList<String> studentArrayList) {
        for (String elem : studentsArray) {
            studentArrayList.add(elem);
        }
    }

    public static void countEvenAndOddNums(int[] myArray) {
        int oddNums = 0;
        int evenNums = 0;
        for (int num : myArray) {
            if (num % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }
        System.out.println("Numbers of even nums: " + evenNums);
        System.out.println("Numbers of odd nums: " + oddNums);
    }

    public static void addCityToList() {
        ArrayList<String> cityArrayList = new ArrayList<>();
        cityArrayList.add("Barcelona");
        cityArrayList.add("Napoli");
        cityArrayList.add("London");
        cityArrayList.add("Bucharest");
        cityArrayList.add("Bremen");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a new city in the list. Type 'done' to stop adding cities in the list. ");
        while (true) {
            String inputCity = scanner.nextLine();
            if (inputCity.equalsIgnoreCase("done")) {
                break;
            } else if (cityArrayList.contains(inputCity)) {
                System.out.println("The city that you entered is already in the list. Please enter another city: ");
            } else {
                cityArrayList.add(inputCity);
                System.out.println(inputCity + " has been added to the list! ");
            }
        }
        System.out.println("The new list is: ");
        for (String city : cityArrayList) {
            System.out.println(city);
        }
        scanner.close();
    }
}