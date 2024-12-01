/*
		---     Queue Behavior with LinkedList  --- 
	Create a Java program that uses a LinkedList to simulate a queue. Add the names 
	{"Alice", "Bob", "Charlie", "Diana"} to the queue. Remove two names from the front of the queue, 
	then print the names that remain in the queue.
*/
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
    
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        queue.poll();
        queue.poll();

        System.out.println("Remaining names in the queue: " + queue);
    }
}
