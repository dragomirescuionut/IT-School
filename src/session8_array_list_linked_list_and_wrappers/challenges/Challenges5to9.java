package session8_array_list_linked_list_and_wrappers.challenges;

import java.util.*;

public class Challenges5to9 {
    public static void main(String[] args) {
        System.out.println("\n--- Challenge 6: ---");
        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("Bob");
        studentNames.add("John");
        studentNames.add("Michael");
        studentNames.add("Daniel");
        removeStudentFromList(studentNames, "Daniel");

        System.out.println("\n--- Challenge 7: ---");
        String[] fruitsArray = {"banana", "cherry", "apple", "orange", "cocos"};
        ArrayList<String> fruitsList = new ArrayList<>();
        populateList(fruitsArray, fruitsList);

        sortFruitsList(fruitsList);

        System.out.println("Sorted fruit list: ");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }


        System.out.println("\n--- Challenge 8: ---");
        String[] movieTitles = {"The Godfather", "Star Wars", "Dune", "the Equalizer", "Lord Of The Rings", "Harry Potter"};
        String targetTitle = "Dune";
        printMoviePositionInArray(movieTitles, targetTitle);

        System.out.println("\n--- Challenge 9: ---");
        String binaryNumber = "1011";
        printDecimalNumber(binaryNumber);
    }

    public static void printDecimalNumber(String binaryNumber) {
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("The binary representation of the number: " + binaryNumber);
        System.out.println("The binary representation of the number: " + decimalNumber);
    }

    public static void printMoviePositionInArray(String[] movieNames, String targetMovie) {
        for (int index = 0; index < movieNames.length; index++) {
            if (movieNames[index].equals(targetMovie)) {
                System.out.println("You movie is at index : " + index);
            }
        }
    }

    //failed bubble sort
    //    public static void sortFruitsList(ArrayList<String> fruitsList) {
//        for (int index = 0; index < fruitsList.size() - 1; index++) {
//            for (int index2 = 0; index2 < fruitsList.size() - index - 1; index2++) {
//                String fruit1 = fruitsList.get(index2);
//                String fruit2 = fruitsList.get(index2 + 1);
//                String tempFruit = fruitsList.get(index2);
//                if (fruit1.length() < fruit2.length()) {
//                    fruitsList.set(index2, fruitsList.get(index2 + 1));
//                    fruitsList.set(index2 + 1, tempFruit);
//                } else if (fruit1.length() == fruit2.length()) {
//                    if (fruit1.compareTo(fruit2) > 0) {
//                        fruitsList.set(index2, fruitsList.get(index2 + 1));
//                        fruitsList.set(index2 + 1, tempFruit);
//                    }
//                }
//            }
//        }
//    }
    public static void sortFruitsList(List<String> fruitList) {
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthComparison = Integer.compare(fruit2.length(), fruit1.length());
                if (lengthComparison == 0) {
                    return fruit1.compareTo(fruit2);
                }
                return lengthComparison;
            }
        };
        Collections.sort(fruitList, customComparator);
    }

    public static void removeStudentFromList(LinkedList<String> studentNamesList, String studentToRemove) {
        LinkedList<String> studentNameListCopy = new LinkedList<>(studentNamesList); //to avoid ConcurrentModificationException
        for (String student : studentNameListCopy) {
            if (studentToRemove.equals(student)) {
                System.out.println("Found a match, removing " + studentToRemove);
                studentNamesList.remove(studentToRemove);
            }
        }
        System.out.println("The new student list, after removing " + studentToRemove + " is: " + studentNamesList);
    }

    public static void populateList(String[] initialArray, List<String> targetArray) {
        for (String elem : initialArray) {
            targetArray.add(elem);
        }
    }
}