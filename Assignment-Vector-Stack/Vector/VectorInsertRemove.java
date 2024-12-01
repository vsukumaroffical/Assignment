/*
	3.**Insert and Remove Elements**:
   Write a Java program that creates a `Vector` of characters. Add the characters {'A', 'B', 'C', 'D', 'E'}
   to the vector. Insert the character 'X' at the third position (index 2). Remove the character at the first
   position (index 0). Print the resulting vector.
4
*/

import java.util.Vector;

public class VectorInsertRemove {
    public static void main(String[] args) {
        Vector<Character> chars = new Vector<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        chars.add(2, 'X');
        chars.remove(0);
		System.out.println("Resulting Vector: " + chars);
    }
}
