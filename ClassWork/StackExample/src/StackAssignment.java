import java.util.Stack;

public class StackAssignment {
public static void main(String [] args) {
	Stack<Integer> firstStack= new Stack<Integer>();
	firstStack.push(1);
	firstStack.push(2);
	firstStack.push(3);
	firstStack.push(4);
	firstStack.push(5);
	firstStack.push(6);
	firstStack.push(7);
	firstStack.push(8);
	firstStack.push(9);
	firstStack.push(10);
	System.out.println(firstStack);
	System.out.println(firstStack.get(9));
	System.out.println(firstStack.peek());
	System.out.println(firstStack.pop());
	System.out.println(firstStack);
	System.out.println(firstStack.peek());
	firstStack.clear();
	System.out.println(firstStack);
	
	firstStack.add(11);
	
	System.out.println(firstStack);
}
}
