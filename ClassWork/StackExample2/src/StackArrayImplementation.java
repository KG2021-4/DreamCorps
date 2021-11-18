
import java.util.Arrays;
public class StackArrayImplementation {
	// current stack is empty
	public static int top = -1;
	// Giving the array a set size. I used the length of 10 to represent a stack
	// when first created
	public static int size = 10;
	// This is our horizontial stack
	public static int[] A = new int[size];
	public static void main(String[] args) {
		// System.out.println(Arrays.toString(A));
		push(1); // index 0
		push(2);
		push(3);
		push(4);
		push(5); // index 4
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		// System.out.println(isEmpty());
		pop();
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		pop();
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		pop();
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		pop();
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		
		System.out.println(Arrays.toString(A));
		System.out.println(top());
		// System.out.println(isEmpty());
	}
	public static int top() {
		return A[top];
	}
	public static int pop() {
		int temp = A[top];
		top--;
		return temp;
	}
	public static void push(int x) {
		top++;
		A[top] = x;
	}
	public static boolean isEmpty() {
		return (top == -1);
	}

}


