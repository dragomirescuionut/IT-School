package session14_collections.challenges.hashSet;

import java.util.*;
import java.util.stream.Collectors;

public class Challenges1to12 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("1.  Write a Java program to append the specified element to the end of a hash set. ");
        System.out.println("Not really possible because HashSets are unordered due to the hashing mechanism used to store elements. ");
        addElementAtTheEnd(fruits, "Apple");

        System.out.println("2.  Write a Java program to iterate through all elements in a hash list. ");
        iterateSet(fruits);

        System.out.println("3. Write a Java program to get the number of elements in a hash set. ");
        System.out.println("Number of elements in the fruits hash set: " + fruits.size());

        System.out.println("4. Write a Java program to empty a hash set.");
        fruits.clear();
        System.out.println("The empty set: " + fruits);

        System.out.println("5. Write a Java program to test a hash set is empty or not. ");
        System.out.println("Is Hash Set empty: " + isHashSetEmpty(fruits));

        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Orange");
        //  fruits.add(null);

        System.out.println("6.  Write a Java program to clone a hash set to another hash set. ");
        System.out.println("The cloned Hash Set is: " + cloneHashSet(fruits));

        System.out.println("7.  Write a Java program to convert a hash set to an array. ");
        String[] fruitsArray = convertHashSetToArray(fruits);
        System.out.println("Array from Hash Set: " + Arrays.toString(fruitsArray));

        System.out.println("8. Write a Java program to clone a hash set to another hash set");
        System.out.println(convertHashSetToTreeSet(fruits));

        System.out.println("9. Write a Java program to convert a hash set to a List/ArrayList. ");
        if (convertHashSetToArrayList(fruits) instanceof ArrayList<String>) {
            System.out.println("Hash Set has been successfully converted to an Array List!");
        } else {
            System.out.println("Hash Set is not an ArrayList! ");
        }

        System.out.println("10.  Write a Java program to compare two hash set. ");
        HashSet<String> vegetables = new HashSet<>();
        vegetables.add("Carrot");
        vegetables.add("Tomatoes");
        vegetables.add("Cherry");
        System.out.println("Are the two Hash Maps equal: " + areTwoHashSetsTheSame(fruits, vegetables));

        System.out.println("11.  Write a Java program to compare two sets and retain elements which are same on both sets. ");

        HashSet<String> result = retainSameElements(fruits, vegetables);
        System.out.println("The retained elements are:  " + result);

        System.out.println("12. Write a Java program to remove all of the elements from a hash set. ");
        System.out.println(removeAllElements(fruits));


    }

    public static HashSet<String> removeAllElements(HashSet<String> hashSet1) {
        hashSet1.clear();
        return hashSet1;
    }

    public static HashSet<String> retainSameElements(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> result = new HashSet<>(hashSet1);
        result.retainAll(hashSet2);
        return result;
    }

    public static boolean areTwoHashSetsTheSame(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        return hashSet1.equals(hashSet2);
    }

    public static ArrayList<String> convertHashSetToArrayList(HashSet<String> hashSet) {
        ArrayList<String> arrayList = (ArrayList<String>) hashSet.stream().collect(Collectors.toList());
        return arrayList;
    }

    public static TreeSet<String> convertHashSetToTreeSet(HashSet<String> hashSet) {
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        return treeSet;

    }

    public static String[] convertHashSetToArray(HashSet<String> hashSet) {
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        return array;
    }

    public static HashSet<String> cloneHashSet(HashSet<String> hashSet) {
        HashSet<String> newHashSet = new HashSet<>(hashSet);
        return newHashSet;
    }

    public static boolean isHashSetEmpty(HashSet<String> hashSet) {
        return hashSet.isEmpty();
    }

    public static void iterateSet(HashSet<String> hashSet) {
        for (String elem : hashSet) {
            System.out.println(elem);
        }
    }

    public static void addElementAtTheEnd(HashSet<String> hashSet, String elementToAdd) {
        hashSet.add(elementToAdd);
        System.out.println(hashSet);
    }
}