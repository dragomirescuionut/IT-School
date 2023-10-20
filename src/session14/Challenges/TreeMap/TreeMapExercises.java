package session14.Challenges.TreeMap;

import session9_oopConcepts.Challenges.CollageManagementSystem.Person;

import java.util.Comparator;
import java.util.TreeMap;

import static session14.Challenges.TreeMap.TreeMapUtils.*;


public class TreeMapExercises {
    public static void main(String[] args) {

        //1.Write a Java program to associate the specified value with the specified key in a Tree Map.
        TreeMap<String, Integer> fruits = new TreeMap<>();
        associateValueToKey(fruits, "apple", 10);
        associateValueToKey(fruits, "kiwi", 5);
        associateValueToKey(fruits, "pineapple", 9);
        associateValueToKey(fruits, "cherry", 20);
        System.out.println("The original tree map is: ");
        displayTreeMap(fruits);

        //2. Write a Java program to copy a Tree Map content to another Tree Map.
        System.out.println("The copy of the original tree map is: ");
        displayTreeMap(copyTreeMap(fruits));

        //3. Write a Java program to search a key in a Tree Map.
        boolean keyToFind = isKeyInTreeMap(fruits, "cherry");
        if (keyToFind) {
            System.out.println("Key was found!");
        } else {
            System.out.println("Key not found!");
        }

        //4.Write a Java program to search a value in a Tree Map.
        Integer valueToFind = 20;
        boolean wasValueFound = isValueInTreeMap(fruits,valueToFind);
        if(wasValueFound){
            System.out.println("Value: " + valueToFind + " was found! ");
        }
        else {
            System.out.println("Value not found! ");
        }

        //5.  Write a Java program to get all keys from the given a Tree Map.
        getAllKeysFromTreeMap(fruits);

        //6.  Write a Java program to delete all elements from a given Tree Map.
        deleteAllElement(fruits);
        displayTreeMap(fruits);


    }
}
