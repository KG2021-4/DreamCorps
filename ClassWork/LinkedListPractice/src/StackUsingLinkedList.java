
public class StackUsingLinkedList {
	// No main method because this class
	//only holds the implemented Stack method
	//no need to use 'static'

		// Instead of making top == -1
		// as we do for any empty array
		// For nodes, we just say that
		// top has no reference ---> null

		// Create a Node object (which is a class we created)
		// named it top.
		Node top;

		// Constructor

		public StackUsingLinkedList() {
			// Using the this keyword (referring to the class)
			// we will then reference the class variable
			// top and give is a value of null in the constructor

			this.top = null;
			// When I give top the value of null, my node does not
			// have a reference to anything, yet.

		}

		// Begin implementation
		// Stacks methods

		// push()
		public void push(int x) {
			// Create a new Node Object, a temp node variables
			Node temp = new Node();
			// temp, give it the value of x. We store x in the data
			// section of the Node
			temp.data = x;

			// In a Stack, when we push, top++
			// LinkedList version, move the reference of the Node object top
			// to temp variable reference

			temp.next = top;

			// temp is the new top --> temp is the top of stack
			top = temp;

		}

		// isEmpty()

		public boolean isEmpty() {
			// A Stack is empty when top == -1;
			// LinkedList version, top == null
			return top == null;
		}

		// peek()

		public int peek() {
			// check to see if not empty
			if (!isEmpty()) {
				// return top value
				return top.data;
			}
			// else, LL is empty, out print empty StackLL
			else {
				System.out.println("StackLL is empty");
				return -1;
			}

		}

		// pop()
		public void pop() {

			// For a Stack, to pop(), I wanna make sure top != -1. Cant pop an empty stack
			// LinkedList version of a Stack, top != null
			if (top == null) {
				// LinkedList version of a Stack, top != null
				// if top == null, out print empty
				System.out.print("Stack is empty");
			} else {

				// if its not empty, make top equal to top.next (the reference to the next node)
				// cause we are popping the node at the beginning
				top = (top).next;
			}

		}

		// I wanna see how the Stack Linked List looks like
		// displayLinkedList()
		
		public void displayLinkedList() {
			
			//check to if StackLL is empty
			if (top == null) { 
				//out print empty
				// exits --> stops code
		         System.out.printf("Stack is empty"); 
		      // exits --> stops code
		         System.exit(0);
		     } 
		
			
			
			//else
			 else {
				//move the reference of the Node object top
					// to temp variable reference
		         Node temp = top; 
		      // while true that temp has reference,
		         while (temp != null) { 
		        	//formatting out print
		     		// %d --> print out integer without commas, temp.data
		             System.out.printf("%d->", temp.data);
		           //temp.data will replace %d for each value of the nodes as temp moves up in reference
		     		// by .next 
		             temp = temp.next; 
		         } 
		     } 
			   
		}
}
			
			
		


	
