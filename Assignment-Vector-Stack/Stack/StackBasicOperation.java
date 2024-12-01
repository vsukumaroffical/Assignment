/*
	1. **Basic Stack Operations**:
   Write a Java program that creates a `Stack` of integers. Push the numbers 10, 20, 30, 40, and 50 onto the stack.
   Then, pop the top element and print the remaining elements in the stack.

*/
import java.util.Stack;

public class StackBasicOperation {
    public static void main(String[] args) {
		
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
		
        System.out.println("Remaining elements in the stack: " + stack);
    }
}
