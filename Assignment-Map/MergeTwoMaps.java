import java.util.HashMap;

/*
5. **Merge Two Maps**:
   Create a Java program that initializes two `HashMap` objects: the first map with entries ("a", 1), ("b", 2) and the second 
   map with entries ("b", 3), ("c", 4). Write a method to merge the two maps. If a key is present in both maps, the value from 
   the second map should overwrite the value from the first map. Print the resulting map.
*/
public class MergeTwoMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        map2.forEach((key, value) -> map1.put(key, value));

        System.out.println("Merged map:");
        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }
    }
}
