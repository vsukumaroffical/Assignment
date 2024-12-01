/*
	5. **Vector to Array Conversion and Vice Versa**:
   Write a Java program that initializes a `Vector` of strings with the values {"red", "green", "blue", "yellow"}. 
   Convert the vector to an array, print the array, then convert the array back to a vector and print the resulting vector.
----------------
*/
import java.util.Arrays;
import java.util.Vector;

public class VectorArrayConversion {
    public static void main(String[] args) {
       
        Vector<String> colors = new Vector<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
 
        String[] colorArray = colors.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(colorArray));
        
        Vector<String> colorVector = new Vector<>(Arrays.asList(colorArray));
        System.out.println("Vector from Array: " + colorVector);
    }
}
