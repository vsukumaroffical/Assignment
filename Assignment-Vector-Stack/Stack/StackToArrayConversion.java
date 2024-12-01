/*
	5. **Stack to Array Conversion**:
   Write a Java program that initializes a `Stack` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
   Convert the stack to an array and print the array. Then, create a new stack from the array and print the 
   elements of the new stack.

*/

import java.util.Arrays;
import java.util.Stack;

public class StackToArrayConversion {
    public static void main(String[] args) {
      
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);

        Double[] array = stack.toArray(new Double[0]);
        System.out.println("Array: " + Arrays.toString(array));

        Stack<Double> newStack = new Stack<>();
        newStack.addAll(Arrays.asList(array));
        System.out.println("New Stack from Array: " + newStack);
    }
}
