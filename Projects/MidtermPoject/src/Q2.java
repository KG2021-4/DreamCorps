import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Q2 {
	public static void main(String[] args) {
		/*
		 * ax2 + bx + c = 0
		 * 
		 * Write a Java program that asks the user for coefficients a, b, c and compute
		 * the roots.
		 * 
		 * Output:
		 * 
		 * Enter a: 2 Enter b: -3 Enter c: -4
		 * 
		 * Root 1 is 2.350781 Root 2 is -0.850781
		 */
		//Declare Variables
		double a;
		double b;
		double c;
		double root1;
		double root2;
		//Initialize Scanner
    
		Scanner userInput = new Scanner(System.in);
		// Get userInput and Store in variable
		System.out.println("Enter first coefficient a");
		a = Double.parseDouble(userInput.nextLine());
		System.out.println("Enter Second coefficient b");
		b = Double.parseDouble(userInput.nextLine());
		System.out.println("Enter Third coefficient c");
		c = Double.parseDouble(userInput.nextLine());
		//Get discriminant
		double d = b * b - 4.0 * a * c;
		//  there are two real roots.
		if (d > 0.0) {
			root1 = (-b +  Math.sqrt(d)) / (2.0 * a);
			root2 = (-b - Math.sqrt(d)) / (2.0 * a);

			System.out.println("Root 1 is: " + root1);
			System.out.println("Root 2 is: " + root2);
			//There is one real root.
		} else if (d == 0.0) {
			 root1 = -b / (2.0 * a);
			System.out.println("The root is " + root1);
		} else {
			System.out.println("not real.");
		}

	}

}
