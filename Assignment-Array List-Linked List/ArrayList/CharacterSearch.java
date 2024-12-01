/*
	3. **Search for an Element**:
   Write a Java program that creates an `ArrayList` of characters. Add ten different characters to the list.
   Write a method that takes a character as an argument and returns the index of the character in the list.
♦   If the character is not found, return -1.
*/
import java.util.ArrayList;

public class CharacterSearch {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('f');
        characters.add('g');
        characters.add('h');
        characters.add('i');
        characters.add('j');

        char searchChar = 'e';
        System.out.println("Index of '" + searchChar + "': " + findIndex(characters, searchChar));
    }

    public static int findIndex(ArrayList<Character> list, char target) {
        return list.indexOf(target);
    }
}
