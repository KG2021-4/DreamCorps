
import java.util.Stack;

public class StackHomework {

	public static void main(String[] args) {
		//WHEN RAN MY APPLICATION THROUGH MAIN
	/*	// INITIALIZE STACK
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		// ADD VALUES
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack2.push(1);
		stack2.push(3);
		stack2.push(104);
		stack2.push(1738);
		// INITALIZE MAX VARIBLE TO THE FIRST INDEX OF EACH STACK
		int max = stack.indexOf(0);
		int max2 = stack2.indexOf(0);
		// LOOP THROUGH STACK1: IF CONDITION TEST IF EACH ELEMENT IS GREATER THEN THE
		// FIRT INDEX
		// IF IT IS SET ASSIGNS NEW VALUE OF ELEMENT THEN LOOPS.
		for (int i = 0; i < stack.size(); i++) {
			if (stack.elementAt(i) > max) {
				max = stack.get(i);

			}

		}
		// LOOP THROUGH STACK2: IF CONDITION TEST IF EACH ELEMENT IS GREATER THEN THE
		// FIRT INDEX
		// IF IT IS SET ASSIGNS NEW VALUE OF ELEMENT THEN LOOPS.
		for (int j = 0; j < stack2.size(); j++) {
			if (stack2.elementAt(j) > max2) {
				max2 = stack2.get(j);

			}

			
			

		}

		// INITIALZE NEW STACK3
		Stack<Integer> stack3 = new Stack<Integer>();
		// LOOPS THROGH STACK1 ADDS VALUE TO STACK3
		for (int i : stack) {
			stack3.push(i);
		}
		// LOOPS THROGH STACK1 ADDS VALUE TO STACK3
		for (int i : stack2) {
			stack3.push(i);
		}
		// Find MAX of Stack3
		int max3 = stack3.get(0);
		for (int l = 0; l < stack3.size(); l++) {
			if (stack3.get(l) > max3) {
				max3 = stack3.get(l);

			}

		}
		// Print stacks and their Max value.
		System.out.println("STACK 1 :" + stack);
		System.out.println("STACK 2 :" + stack2);
		System.out.println("STACK 3 :" + stack3);
		// CHECKS TO SEE IF STACK 1 AND 2 HAVE THE SAME SIZE
		if (stack.size() == stack2.size()) {
			System.out.println("both Stacks 1 AND Stack2 are Equal is Size");
			// IF ITS CHECK TO SEE IF THE TWO STACKS ARE EQUAL
			if (stack.equals(stack2)) {
				System.out.println("Elements of both stacks equal");
			} else {
				System.out.println("Elements of both stacks are not equal");
			}

		} else {
			System.out.println("Stack 1 and 2 are not Equal is Size");
		}
		System.out.println("MAX of Stack 1: " + max);
		System.out.println("MAX of Stack 2: " + max2);
		System.out.println("MAX value between two stacks is: " + max3);
/
 * 
 */
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack2.push(1);
		stack2.push(3);
		stack2.push(104);
		stack2.push(1738);
		System.out.println(stack);
		System.out.println(stack2);
		
		System.out.println("MAX of Stack 1: " + getMax(stack));
		System.out.println("MAX of Stack 2: " +getMax(stack2));
		System.out.println("MAX Between Stack 1 and Stack 2: " +findMaxBetweenTwoStack(stack,stack2));
		ifEqualInSize(stack,stack2);
		findMaxBetweenTwoStack(stack,stack2);
	}
	public static int getMax(Stack<Integer> stack) {
		int max = stack.get(0);
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) > max) {
				max = stack.get(i);
			}
           
	}
		return max;
	}
	public static void ifEqualInSize(Stack<Integer> stack, Stack<Integer> stack2) {
		if(stack.size()==stack2.size()) {
			System.out.println("both Stacks 1 AND Stack2 are Equal is Size");
			ifEqual(stack, stack2);
		} else {
			System.out.println("both Stacks 1 AND Stack2 are Not Equal is Size");
		}
		
	}
	public static void ifEqual(Stack<Integer> stack, Stack<Integer> stack2) {
		if (stack.equals(stack2)) {
			System.out.println("Elements of both stacks equal");
		} else {
			System.out.println("Elements of both stacks are not equal");
		}
		
	}
   public static int findMaxBetweenTwoStack(Stack<Integer> stack, Stack<Integer> stack2) {
	  int max1 = getMax(stack);
	  int max2 = getMax(stack2);
	  if(max2 > max1) {
	   return max2;
	  } 
		  return max1;
	  }
	 
   }
	
