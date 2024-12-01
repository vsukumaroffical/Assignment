/*
   3. **LinkedList Operations**:
   Write a Java program that creates a `LinkedList` of integers. Add the numbers 1 to 10 to the list. Then, remove the third element 
  (index 2) and the last element from the list. Print the resulting list.

*/
import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(2); 
        numbers.removeLast();

        System.out.println("List after removals: " + numbers);
    }
}
