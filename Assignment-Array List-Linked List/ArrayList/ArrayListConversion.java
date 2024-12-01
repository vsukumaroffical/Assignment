/*
	5. **Convert ArrayList to Array and Vice Versa**:
   Write a Java program that initializes an `ArrayList` of strings with the values 
   {"apple", "banana", "cherry"}. Convert the `ArrayList` to an array, print the 
   array, then convert the array back to an `ArrayList` and print the `ArrayList`
*/
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversion {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        ArrayList<String> newList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + newList);
    }   
}
