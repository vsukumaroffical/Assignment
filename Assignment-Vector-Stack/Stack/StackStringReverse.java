/*
	3. **Reverse a String Using Stack**:
   Write a Java program that uses a `Stack` to reverse a string. For example, given the input string "hello", 
   the program should output "olleh".
*/
import java.util.Stack;

public class StackStringReverse {
    public static void main(String[] args) {
        String input = "hello";
        Stack<Character> stack = new Stack<>();
		
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("Reversed string: " + reversed);
    }
}
