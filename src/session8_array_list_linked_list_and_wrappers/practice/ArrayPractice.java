package session8_array_list_linked_list_and_wrappers.practice;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {12, 32, 43, 9};
        sortArray(numbers);
        System.out.println("Printed array: " + Arrays.toString(numbers));
        System.out.println("Binary search index value: " + Arrays.binarySearch(numbers, 9));
        String[][] names = {{"Mr.", "Ms.", "MrMr."}, {"Alice", "John"}};
        print2DArray(names);
        int firstArrayNumber = numbers[0];
        System.out.println("First array number: " + firstArrayNumber);
        printArrasAverage(numbers);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void printArrasAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int average = sum / numbers.length;
        System.out.println("Arrays average: " + average);
    }

    public static void print2DArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index][index2] + " ");
            }
            System.out.println();
        }
    }
}
