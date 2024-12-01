import java.util.HashMap;
/* 
   3. **Check and Remove Entries**:
   Write a Java program that creates a `HashMap` to store student names and their corresponding grades. Add the entries 
   ("John", 85), ("Jane", 92), ("Tom", 76), ("Lucy", 89). Check if "Tom" is in the map and remove his entry if it exists. 
   Print the updated map.
   
*/
public class CheckAndRemoveEntries {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("John", 85);
        grades.put("Jane", 92);
        grades.put("Tom", 76);
        grades.put("Lucy", 89);

        
        if (grades.containsKey("Tom")) {
            grades.remove("Tom");
            System.out.println("Tom's entry removed.");
        }

        System.out.println("Updated map:");
        for (String name : grades.keySet()) {
            System.out.println(name + ": " + grades.get(name));
        }
    }
}
