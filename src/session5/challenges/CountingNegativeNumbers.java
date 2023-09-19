package session5.challenges;

public class CountingNegativeNumbers {
    public static void main(String[] args) {
        int[] myArray = {1, 2, -3, 4, -5, -6, 7};
        countingNegativeNumbers(myArray);
    }

    public static void countingNegativeNumbers(int[] myArray) {
        int counter = 0;
        for (int index : myArray) {
            if (index < 0) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " negative numbers in this array! ");
    }
}