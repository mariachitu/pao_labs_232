package map;

import java.util.*;

public class MapExample {

    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> treeMap = new TreeMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        System.out.println("HashMap:");
        mapExample.doOperationsOnHashMap();

        System.out.println("TreeMap:");
        mapExample.doOperationsOnTreeMap();

        System.out.println("LinkedHashMap:");
        mapExample.doOperationsOnLinkedHashMap();
    }

    private void doOperationsOnHashMap()    {
        hashMap.put(1, "lion");
        hashMap.put(20, "tiger");
        hashMap.put(12, "cat");
        hashMap.put(17, "dog");
        String oldValue = hashMap.put(34, "giraffe");
        printValueAdded(oldValue, hashMap.get(34));
        oldValue = hashMap.put(34, "elephant");
        printValueAdded(oldValue, hashMap.get(34));

        String elementRemoved = hashMap.remove(1);
        System.out.println(elementRemoved);

        boolean result = hashMap.remove(12, "cat");
        System.out.println(result);

        result = hashMap.remove(17, "donkey");
        System.out.println(result);

        System.out.println(hashMap.getOrDefault(17, "Default animal"));
        System.out.println(hashMap.getOrDefault(18, "Default animal"));

        displayMap(hashMap);
        otherDisplayMap();
    }

    private void displayMap(Map map)    {
        Set<Integer> keys = map.keySet();
        for(Integer key: keys)  {
            System.out.println(key + " - " + map.get(key));
        }
    }

    private void otherDisplayMap()   {
        for(Map.Entry<Integer, String> pair : hashMap.entrySet())   {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }
    }

    private void printValueAdded(String oldValue, String newValue)  {
        if(oldValue == null)    {
            System.out.println("first value added to this key is " + newValue);
        } else  {
            System.out.println("Second value added to this key " + newValue + " before it was " + oldValue);
        }
    }

    private void doOperationsOnTreeMap()    {
        treeMap.put(1, "lion");
        treeMap.put(20, "tiger");
        treeMap.put(12, "cat");
        treeMap.put(17, "dog");

        displayMap(treeMap);
    }

    private void doOperationsOnLinkedHashMap()    {
        linkedHashMap.put(1, "lion");
        linkedHashMap.put(20, "tiger");
        linkedHashMap.put(12, "cat");
        linkedHashMap.put(17, "dog");

        displayMap(linkedHashMap);
    }
}
