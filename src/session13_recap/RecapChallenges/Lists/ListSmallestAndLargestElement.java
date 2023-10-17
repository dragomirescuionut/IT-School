package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSmallestAndLargestElement {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList();
        Random random = new Random();
        for (int index = 0; index <= 7; index++) {
            numbersList.add(random.nextInt(100));
        }
        System.out.println(numbersList);
        getSmallestAndLargestElem(numbersList);
    }

    public static void getSmallestAndLargestElem(List<Integer> list) {
        int smallest = list.get(0);
        int largest = list.get(0);

        for (int number : list) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The smallest number in the list is: " + smallest);
        System.out.println("The largest number in the list is: " + largest);
    }
}