package session8_array_list_linked_list_and_wrappers.practice;

import java.util.Random;

public class RandomIntAlg {
    public static void main(String[] args) {

    }
    public static void printRandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(1,17);
        System.out.println("Random number: " + randomNumber);
    }
}
