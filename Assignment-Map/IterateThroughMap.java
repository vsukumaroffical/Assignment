import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
/*
   2. **Iterate Through a Map**:
   Create a Java program that initializes a `TreeMap` with the following entries: ("banana", 2), ("apple", 5), ("cherry", 7), 
   ("date", 3). Use an iterator to print each key-value pair in the map.
*/
public class IterateThroughMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 2);
        treeMap.put("apple", 5);
        treeMap.put("cherry", 7);
        treeMap.put("date", 3);

        System.out.println("Entries in the TreeMap:");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
