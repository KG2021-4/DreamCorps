import java.util.*;
public class StackExample {
	public static int top = -1;
	public static Stack<Integer> salary = new Stack<Integer>();
	public static void main(String[] args) {
		Stack<Integer> salary = new Stack<Integer>();
		salary.push(12);
		salary.push(13);
		salary.push(14);
		salary.push(15);
		salary.push(16);
		// [12,13,14,15,16]
		// size = 5
		// size - 1 = 4
		// size -> 5
		// index range 0-4
//			System.out.println(salary);
//			System.out.println(top(salary));
		// push(1738,salary);
		System.out.println(salary);
		// System.out.println(top(salary));
		System.out.println(searchMax(salary));
	}
	public static int searchMax(Stack<Integer> s) {
		int max = s.get(0);
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i) > max) {
				max = s.get(i);
			}
		}
		return max;
	}
	public static int top(Stack<Integer> s) {
		return s.get(s.size() - 1);
	}
	public static void push(int x, Stack<Integer> s) {
		s.add(x);
		top = s.size() - 1;
	}	
}
