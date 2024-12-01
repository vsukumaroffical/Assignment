/*
	4. **Check for Element and Vector Size**:
   Write a Java program that creates a `Vector` of doubles. Add five random double values to the vector. 
   Check if the value 10.5 is in the vector. Print the size of the vector before and after adding an additional value.

*/
import java.util.Vector;

public class VectorCheckSize {
    public static void main(String[] args) {
      
        Vector<Double> numbers = new Vector<>();
        numbers.add(5.3);
        numbers.add(10.5);
        numbers.add(3.8);
        numbers.add(7.9);
        numbers.add(2.6);

        boolean containsValue = numbers.contains(10.5);
        System.out.println("Contains 10.5: " + containsValue);
        System.out.println("Size before adding: " + numbers.size());
        numbers.add(6.4);
        System.out.println("Size after adding: " + numbers.size());
    }
}
