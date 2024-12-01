/* 1. **Add and Access Elements**:
   Write a Java program that creates a `LinkedList` of integers. Add the numbers 5, 10, 15, 20, and 25 to the list. 
   Retrieve and print the first and last elements in the list. */
 import java.util.LinkedList;
 public class AccessLinkedList{
	public static void main(String []args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println("First Element : "+list.getFirst());
		System.out.println("Last  Element : "+list.getLast());
	}
 } 