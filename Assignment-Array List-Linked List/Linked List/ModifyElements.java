/* 
**Iterate and Modify Elements**:
   Create a Java program that initializes a `LinkedList` of strings with the values 
   {"one", "two", "three", "four", "five"}. Use a `ListIterator` to iterate through the
◘   list and replace every occurrence of the word "three" with "THREE". Print the modified list.

*/

import java.util.LinkedList;
import java.util.ListIterator;

public class ModifyElements {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

       
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("three")) {
                iterator.set("THREE");
            }
        }

        
        System.out.println("Modified list: " + words);
    }
}
