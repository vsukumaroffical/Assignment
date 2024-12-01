/*
	4. **Balanced Parentheses**:
   Create a Java program that checks if a string containing parentheses is balanced using a `Stack`.
   For example, the input "(())" is balanced, but the input "(()" is not.

*/
import java.util.Stack;

public class StackBalancedParentheses {
    public static void main(String[] args) {
        String input = "(())";
        System.out.println("Is balanced: " + isBalanced(input));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
