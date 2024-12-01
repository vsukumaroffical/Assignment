/* Reverse LinkedList**:
   Write a Java program that creates a `LinkedList` of characters with the values {'A', 'B', 'C', 'D', 'E'}.
   Write a method to reverse the linked list and print the reversed list.*/

import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> characters = new LinkedList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
		
        Collections.reverse(characters);
        
	System.out.println("Reversed list: " + characters);
    }
}
