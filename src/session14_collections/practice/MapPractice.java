package session14_collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();

        int retrivedValue = retriveValue(myMap, "Two");
        System.out.println("Retrieved value: " + retrivedValue);

        updateMap(myMap, "three", 10);
        System.out.println("Update value: " + retriveValue(myMap, "three"));
    }

    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    private static int retriveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        return myMap;
    }
}