package session5.challenges;


public class FoorEachLoopChallenge {
    public static void main(String[] args) {
        int[] myArray = {1, 12, 5, 6, 9, 19};
        evenOrOddChecker(myArray);
    }

    public static void evenOrOddChecker(int[] myArray) {

        for (int item : myArray) {
            if (item % 2 == 0) {
                System.out.println(item + " is EVEN! ");
            } else {
                System.out.println(item + " is ODD! ");
            }
        }
    }
}