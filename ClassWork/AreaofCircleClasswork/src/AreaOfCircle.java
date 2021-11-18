import java.util.Scanner;

public class AreaOfCircle {
	public static Scanner userInput = new Scanner(System.in);
	public static void main (String[]args) {
		//write the lines of code test
		//create a mini calculator that takes input from the user, the user will input two ints, and the select a operator (+ and -)
		//scanner --> get input from the user
		
		
		
		
		//Ask user to input the numbers
		System.out.println("Please enter the first number");
		//store the first number
		int firstNum = userInput.nextInt();
		
		System.out.println("Please enter the second number");
		//store the second number
		int secondNum = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Please select a operator + or -");
		String operator = userInput.nextLine();
		
		miniCalc(firstNum, secondNum, operator);
		

		}
		

	
	public static void miniCalc(int firstNumber, int secondNumber, String operator) {
      int total;
		if(operator.equals("+")) {
		  total = firstNumber + secondNumber;
			System.out.println("The Total is: " +total );
		} else if(operator.equals("-")){
			total = firstNumber - secondNumber;
			System.out.println("The Total is :" +total );
		} else {
			System.out.println("ENTER A INVALID OPERATOR");
		}
		
		
	}
}