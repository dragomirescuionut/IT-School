package session5_advanced_flow_control.practice;

public class ForExercises {

    public static void main(String[] args) {
        printEvenNumbers(20);
        printFactorialOfNumber(3);

        String[] myArray = {"Apple", "Cherry", "Strawberry"};
        printArray(myArray);

        int[] intArray = {2, 3, 5, 42, 67};
        printArrayMaxValue(intArray);

        printSearchedValue(intArray, 42);

        int[][] secondArray = {{1, 2, 3}, {4, 5, 23}, {2, 12, 4}};
        print2DArray(secondArray);
        System.out.println("First value from first nested array: " + secondArray[0][1]);
    }

    public static void printEvenNumbers(int number) {
        for (int index = 0; index <= number; index += 2) {
            System.out.println(index);
        }
    }

    public static void printFactorialOfNumber(int number) {
        boolean isValid = number < 0;
        if (isValid) {
            System.out.println("Please enter positive number");
            return;
        }
        System.out.println("here");
        int factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void printArrayMaxValue(int[] array) {
        int maxValue = 0;
        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Max value: " + maxValue);
    }

    public static void printSearchedValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                System.out.println("Number found: " + value);
                break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
                System.out.println(array[rowIndex][columnIndex] + " ");
            }
            System.out.println(" ");
        }
    }
}

