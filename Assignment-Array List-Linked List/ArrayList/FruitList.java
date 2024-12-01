import java.util.ArrayList;
/*
  1 Add and Retrieve Elements☻:
   Write a Java program that creates an `ArrayList` of strings. Add five different fruits to the list,
   then retrieve and print the third fruit in the list.
*/
public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("The third fruit is: " + fruits.get(2));
    }
}
