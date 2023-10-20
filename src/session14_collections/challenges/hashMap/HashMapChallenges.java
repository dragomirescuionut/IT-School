package session14_collections.challenges.hashMap;

import java.util.HashMap;

import static session14_collections.challenges.hashMap.HashMapUtils.*;

public class HashMapChallenges {
    public static void main(String[] args) {
        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<String, Integer> map = initilizeMap();

        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        getMapSize(map);

        //3. Write a Java program to copy all of the mappings from the specified map to another map(shallow copy).
        copyMap(map);

        //4. Write a Java program to remove all of the mappings from a map.
        removeMappings(map);

        //5.  Write a Java program to check whether a map contains key-value mappings (empty) or not.
        isMapEmpty(map);

        //6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<String, Integer> map2 = initilizeMap();
        System.out.println("The shallow copy of map2 is: " + shallowCopy(map2));

        //7. Write a Java program to test if a map contains a mapping for the specified key.
        findSpecifiedKey(map2, "pencils");

        //8. Write a Java program to test if a map contains a mapping for the specified value.
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("John", "Johnson");
        map3.put("Michael", "Mike");
        System.out.println("The map contains the searched value: " + findSpecifiedValue(map3, "Mike"));

        //9. Write a Java program to create a set view of the mappings contained in a map.
        printMapAsSet(map2);

        //10. Write a Java program to get the value of a specified key in a map.
        String keyToFind = "John";
        String value = getValueForKey(map3, keyToFind);
        System.out.println(value);


    }
}