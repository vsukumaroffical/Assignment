/*
	**Basic Vector Operations**:
   Write a Java program that creates a `Vector` of integers. Add the numbers 10, 20, 30, 40, and 50 to the vector. 
   Retrieve and print the element at the second index (third element) in the vector. Then, print all elements in the 
   vector.
*/
import java.util.Vector;
public class BasicOperation{
	public static void main(String args[]){
		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Third Element : "+numbers.get(2));
		System.out.println("All Elements  : "+numbers);
		
	}
	
} 