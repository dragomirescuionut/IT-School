package session4.challenges;

public class Challenge18 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println("Array before decrementing: ");
        initializeArray(myArray);
        printArray(myArray);
        System.out.println("\nDecremented Array: ");
        decrementArray(myArray);
        printArray(myArray);
    }

    public static void initializeArray(int[] myArray) {
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = index + 1;
        }
    }

    public static void decrementArray(int[] myArray) {
        for (int index = 0; index < myArray.length; index++) {
            myArray[index]--;
        }
    }

    public static void printArray(int[] myArray) {
        for (int number : myArray) {
            System.out.print(number + " ");
        }
    }
}