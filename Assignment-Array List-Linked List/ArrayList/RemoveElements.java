import java.util.ArrayList;
import java.util.Iterator;
/*

2. **Iterate and Remove Elements**:
   Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}.
   Use an iterator to iterate through the list and remove all elements greater than 30. Print the
   modified list.
*/
public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > 30) {
                iterator.remove();
            }
        }
        System.out.println("Modified list: " + numbers);
    }
}
