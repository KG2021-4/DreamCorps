import java.util.Arrays;

public class Main {
public static void main(String [] args) {
	// Create an Array Object
	Queue q = new Queue();
	//Add elements.
	q.enqueue(12);
	q.enqueue(55);
	q.enqueue(314);
	q.enqueue(22);
	//print front
	System.out.println("Front " + q.front());
	//print back
	System.out.println("Back "  + q.back());
	// remove element
	q.dequeue();
	//Print  front
	System.out.println("Front " + q.front());
	// print back
	System.out.println("Back "  + q.back());
	System.out.println(	q.isEmpty());
}
}
