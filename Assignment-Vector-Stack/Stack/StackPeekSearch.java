/*
2. **Peek and Search in Stack**:
   Create a Java program that initializes a `Stack` of strings with the values {"first", "second", "third", "fourth"}. 
   Use the `peek` method to print the top element without removing it. Then, use the `search` method to find the 
   position of "second" in the stack and print the result.
*/
import java.util.Stack;

public class StackPeekSearch {
    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
		
        System.out.println("Top element (peek): " + stack.peek());
        int position = stack.search("second");
		System.out.println("Position of 'second': " + position);
    }
}

