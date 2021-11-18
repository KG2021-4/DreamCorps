import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Initialize  Scanner 
		Scanner userInput = new Scanner(System.in);
		//Declare Variables 
		double firstNumber;
		double secondNumber;
		String firstOperator;
		double thirdNumber;
		String secondoperator;
		double result;
		System.out.println("This is a simple calculator. Please enter first number");
		firstNumber = Double.parseDouble(userInput.nextLine());
		System.out.println("Please enter operator (+-*/)");
		firstOperator = userInput.nextLine();
		System.out.println("Please second number");
		secondNumber = Double.parseDouble(userInput.nextLine());
		System.out.println("Please enter second operator (+-*/), or press ‘N’ for not needed");
		secondoperator = userInput.nextLine();
		System.out.println("Please enter third number, or press 0 for not needed");
		thirdNumber = Double.parseDouble(userInput.nextLine());
//		
//		switch(firstOperator) {
//		case "+":
//	    result= MiniCalc.add(firstNumber, secondNumber);
//		
//	
//		

		// THIS IF STATMENT TEST FOR ++ firstOperator -- THEN TEST secondoperator 4
		// CONDITONS (+-*/)
		if ("+".equals(firstOperator) && secondoperator.equalsIgnoreCase("N"))

			System.out.println("This result is: " + (int) MiniCalc.add(firstNumber, secondNumber));
		else if ("+".equals(firstOperator) && "+".equals(secondoperator)) {
			result = MiniCalc.add(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.add(result, thirdNumber));

		} else if ("+".equals(firstOperator) && "-".equals(secondoperator)) {
			result = MiniCalc.add(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.subtract(result, thirdNumber));
		} else if ("+".equals(firstOperator) && "*".equals(secondoperator)) {
			result = MiniCalc.add(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.muliply(result, thirdNumber));
		} else if ("+".equals(firstOperator) && "/".equals(secondoperator)) {
			result = MiniCalc.add(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.divide(result, thirdNumber));

		}

		// THIS IF STATMENT TEST FOR // firstOperator -- THEN TEST secondoperator 4
		// CONDITONS (+-*/)
		if ("-".equals(firstOperator) && secondoperator.equalsIgnoreCase("N"))

			System.out.println("This result is: " + (int) MiniCalc.subtract(firstNumber, secondNumber));
		else if ("-".equals(firstOperator) && "+".equals(secondoperator)) {
			result = MiniCalc.subtract(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.add(result, thirdNumber));

		} else if ("-".equals(firstOperator) && "-".equals(secondoperator)) {
			result = MiniCalc.subtract(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.subtract(result, thirdNumber));
		} else if ("-".equals(firstOperator) && "*".equals(secondoperator)) {
			result = MiniCalc.subtract(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.muliply(result, thirdNumber));
		} else if ("-".equals(firstOperator) && "/".equals(secondoperator)) {
			result = MiniCalc.subtract(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.divide(result, thirdNumber));
		}

		// THIS IF STATMENT TEST FOR * firstOperator -- THEN TEST secondoperator 4
		// CONDITONS (+-*/)
		if ("*".equals(firstOperator) && secondoperator.equalsIgnoreCase("N"))

			System.out.println("This result is: " + (int) MiniCalc.muliply(firstNumber, secondNumber));
		else if ("*".equals(firstOperator) && "+".equals(secondoperator)) {
			result = MiniCalc.muliply(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.add(result, thirdNumber));

		} else if ("*".equals(firstOperator) && "-".equals(secondoperator)) {
			result = MiniCalc.muliply(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.subtract(result, thirdNumber));
		} else if ("*".equals(firstOperator) && "*".equals(secondoperator)) {
			result = MiniCalc.muliply(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.muliply(result, thirdNumber));
		} else if ("*".equals(firstOperator) && "/".equals(secondoperator)) {
			result = MiniCalc.muliply(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.divide(result, thirdNumber));

		}
		// THIS IF STATMENT TEST FOR / firstOperator -- THEN TEST secondoperator 4
		// CONDITONS (+-*/)
		if ("/".equals(firstOperator) && secondoperator.equalsIgnoreCase("N"))

			System.out.println("This result is: " + (int) MiniCalc.divide(firstNumber, secondNumber));

		else if ("/".equals(firstOperator) && "+".equals(secondoperator)) {
			result = MiniCalc.divide(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.add(result, thirdNumber));

		} else if ("/".equals(firstOperator) && "-".equals(secondoperator)) {
			result = MiniCalc.divide(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.subtract(result, thirdNumber));
		} else if ("/".equals(firstOperator) && "*".equals(secondoperator)) {
			result = MiniCalc.divide(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.muliply(result, thirdNumber));
		} else if ("/".equals(firstOperator) && "/".equals(secondoperator)) {
			result = MiniCalc.divide(firstNumber, secondNumber);
			System.out.println("This result is: " + (int) MiniCalc.divide(result, thirdNumber));
		}

}
}
