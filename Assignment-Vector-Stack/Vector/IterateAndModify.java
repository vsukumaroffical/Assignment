/*
2. **Iterate and Modify Vector Elements**:
   Create a Java program that initializes a `Vector` of strings with the values
   {"apple", "banana", "cherry", "date", "fig"}. Use an `Enumeration` to iterate through the vector 
   and print each element. Then, replace "cherry" with "coconut" and print the modified vector.
*/
import java.util.Enumeration;
import java.util.Vector;

public class IterateAndModify{
	public static void main(String[] args) {
	Vector<String> fruits = new Vector<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("fig");
		
		
		
		System.out.println("Original Vector:");
        Enumeration<String> enumeration = fruits.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }

        fruits.set(fruits.indexOf("cherry"), "coconut");
        ◘
        System.out.println("\nModified Vector:");
        for (String fruit : fruits) {
            System.out.print(fruit+" ◘");
        }
	}
		
}