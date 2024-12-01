import java.util.HashMap;
/*
	
4. **Count Frequency of Elements**:
   Write a Java program that uses a `HashMap` to count the frequency of each character in a given string. For example, 
   for the string "programming", the program should output the frequency of each character in the string.
*/
public class CountFrequency {
    public static void main(String[] args) {
        String input = "programming";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + ": " + frequencyMap.get(ch));
        }
    }
}
