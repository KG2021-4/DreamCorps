
public class StackLLMain {
public static void main(String[] args) {
		
		//Where I am going to call
		//my implemented stack methods
		//made using LinkedList
		
		// To use a class as a datatype
		//Create an object to use my StackUsingLinkedList
		
		 StackUsingLinkedList obj = new StackUsingLinkedList(); 
		 
		     obj.push(11); 
		     obj.push(22); 
		     obj.push(33); 
		     obj.push(44);
		     
		     // reference the object I created, 
		     // the '.' references all the methods in the class
		     // that was used as the objects datatype
		     
		     obj.displayLinkedList();

		     System.out.printf("\nTop element is %d\n", obj.peek());
		     obj.pop(); 
		     obj.pop(); 
		     obj.displayLinkedList(); 
		     System.out.printf("\nTop element is %d\n", obj.peek());
		     
		//code runs here

	}

}

