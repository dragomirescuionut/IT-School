package session14_collections.challenges.treeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapUtils {
    /*   public static TreeMap<String,Integer> sortTreeMap(TreeMap<String,Integer> inputMap, Comparator<String> keyComparator){
           TreeMap<String, Integer> sortedMap = new TreeMap<>(keyComparator);
           sortedMap.putAll(inputMap);
           return sortedMap;
      } */
    public static void deleteAllElement(TreeMap<String, Integer> treeMap) {
        treeMap.clear();
        System.out.println("Tree map was emptied! ");
    }

    public static void getAllKeysFromTreeMap(TreeMap<String, Integer> treeMap) {
        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    public static boolean isValueInTreeMap(TreeMap<String, Integer> treeMap, Integer valueToFind) {
        for (Integer value : treeMap.values()) {
            if (value == valueToFind) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKeyInTreeMap(TreeMap<String, Integer> treeMap, String keyToSearch) {
        return treeMap.containsKey(keyToSearch);
    }

    public static TreeMap<String, Integer> copyTreeMap(TreeMap<String, Integer> treeMap) {
        TreeMap<String, Integer> copyMap = new TreeMap<>();
        for (String key : treeMap.keySet()) {
            copyMap.put(key, treeMap.get(key));
        }
        return copyMap;
    }

    public static void associateValueToKey(TreeMap<String, Integer> treeMap, String key, Integer value) {
        treeMap.put(key, value);
    }

    public static void displayTreeMap(TreeMap<String, Integer> map) {
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}