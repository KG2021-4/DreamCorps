package retry;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a =100;
		int b=20;
		int c=5;
		//Approach 1
		if(a>b && a>c) {
			System.out.println("The Largest Number is: " + a);
		} else if(b>a && b>c) {
			System.out.println("The Largest Number is: " + b);
		} else {
			System.out.println("The Largest Number is: " + c);
		}
		//Approach 2
		//Ternary Operator
		int largestOfTwoNumbers = a>b?a:b;
		int largestOfThreeNumbers = c>largestOfTwoNumbers?c:largestOfTwoNumbers;
		System.out.println("The Largest Number is: " + largestOfThreeNumbers);
		int largest = findLargestOfThreeNumbers(100,200,3);
		System.out.println("The Largest Number is: " + largest);
	}
	public static int findLargestOfThreeNumbers(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		} else if(b>a && b>c) {
			return b;
		} else {
			return c;
		}
		
	}

}
