package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
public static void main(String [] args) {
	//Queue Methods:  add,
	Queue<Person> superMarket = new LinkedList<>();
	superMarket.add(new Person("Alex", 21));
	superMarket.add(new Person("Mariam", 18));
	superMarket.add(new Person("Ali", 40));
	System.out.println(superMarket.size());
	
	System.out.println(superMarket.peek());
	
	System.out.println(superMarket.poll());
	System.out.println(superMarket.size());
	System.out.println(superMarket.peek());
	System.out.println(superMarket.peek());

	
}
static record Person(String name, int age) {
	
}
}
