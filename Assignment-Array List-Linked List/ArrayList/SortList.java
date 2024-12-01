/*
	4. **Sort an ArrayList**:
   Create a Java program that initializes an `ArrayList` of integers with random values between 1 and 10♦0
   Add ten integers to the list. Sort the list in ascending order and print the sorted list.
*/
import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(89);
        numbers.add(2);
        numbers.add(76);
        numbers.add(25);
        numbers.add(34);
        numbers.add(58);
        numbers.add(92);
        numbers.add(11);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
