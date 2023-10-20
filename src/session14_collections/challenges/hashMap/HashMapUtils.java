package session14_collections.challenges.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapUtils {
    public static String getValueForKey(Map<String, String> map, String keyToFind) {
        if (map.containsKey(keyToFind)) {
            return map.get(keyToFind);
        } else {
            return null;
        }
    }

    public static void printMapAsSet(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static boolean findSpecifiedValue(HashMap<String, String> map, String valueToFind) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(valueToFind)) {
                return true;
            }
        }
        return false;
    }

    public static void findSpecifiedKey(HashMap<String, Integer> map, String keyToFind) {

        if (map.containsKey(keyToFind)) {
            System.out.println("The map contains a mapping for key: " + keyToFind + " and the mapping for this key is: " + map.get(keyToFind));
        } else {
            System.out.println("The map does not contain a mapping for the key! ");
        }
    }

    public static HashMap<String, Integer> shallowCopy(HashMap<String, Integer> map) {
        Map<String, Integer> shallowCopy = new HashMap<>();
        shallowCopy.putAll(map);
        return map;

    }

    public static void isMapEmpty(HashMap<String, Integer> map) {
        boolean result = map.isEmpty();
        if (result) {
            System.out.println("The Hash Map is empty! ");
        } else {
            System.out.println("The Hash Map is not empty! ");
        }
    }

    public static void removeMappings(HashMap<String, Integer> map) {
        System.out.println("Map before removing: " + map);
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Map after removing: " + map);
    }

    public static void copyMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copyMap = new HashMap<>(map);
        System.out.println("New copied map :" + copyMap);
    }

    public static void getMapSize(HashMap<String, Integer> map) {
        System.out.println("Map size is: " + map.size());
    }

    public static HashMap<String, Integer> initilizeMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("books", 3);
        map.put("noteBooks", 10);
        map.put("pencils", 14);
        return map;
    }
}