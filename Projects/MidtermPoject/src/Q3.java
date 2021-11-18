import java.util.Scanner;

public class Q3 {
public static void main(String [] args) {
	//Declare Variables 
	// initialize Count variables to determine number of correct choices. 
	int q1;
	int q2;
	int q3;
	int count =0;
	//Initialize Scanner
	Scanner userInput = new Scanner(System.in);
	// Get userInput for Multiple Choice Questions
	System.out.println("What is 1 +1?");
	System.out.println(" 1.) 5 \n 2.) 61 \n 3.) 2");
	q1 = Integer.parseInt(userInput.nextLine());
	// Use If condition to Determine if UserChoice is correct. 
	//Print our a Correct message if accurate and Print out wrong answer response along with correct answer if not.,
	if(q1==3) {
		System.out.println("You are Correct!");
		count++;
	} else {
		System.out.println("That is Wrong The correct answer is  2");
	}
	System.out.println("What is 66 +1?");
	System.out.println(" 1.) 6 \n 2.) 67 \n 3.) 65");
	q2 = Integer.parseInt(userInput.nextLine());
	if(q2==2) {
		System.out.println("You are Correct!");
		count++;
	} else {
		System.out.println("That is Wrong The correct answer is  67");
	}
	System.out.println("What is 11 *1?");
	System.out.println(" 1.) 12 \n 2.) 61 \n 3.) 11");
	q3 = Integer.parseInt(userInput.nextLine());	
	if(q3==3) {
		System.out.println("You are Correct!");
		count++;
	} else {
		System.out.println("That is Wrong The correct answer is  11");
	}
	// Print total count and Thanks for Playing Message.
	System.out.println("Overall, you got " + count +" out of 3 correct");
	System.out.println("Thanks for playing!");

}
}