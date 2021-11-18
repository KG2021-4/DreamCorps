import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		// Invoke Method to Test.
		examGrader('A');
		examGrader('a');
		examGrader('B');
		examGrader('C');
		examGrader('D');
		examGrader('z');
	}

	public static void examGrader(char letterGrade) { 
		//Initialize Scanner
		Scanner userInput = new Scanner(System.in);
			
	   // If statement to find Letter grade A-F
		if (letterGrade == 'A' || letterGrade == 'a') {
			System.out.println("Awesome");
		} else if (letterGrade == 'B' || letterGrade == 'b') {
			System.out.println("Great");
		} else if (letterGrade == 'C' || letterGrade == 'c') {
			System.out.println("Cool");

		} else if (letterGrade == 'D' || letterGrade == 'd' || letterGrade == 'F' || letterGrade == 'f') {
			System.out.println("Not the best");
		} else {
			//IF it is not A,B,C,D,F Ask the user to enter number Again and Call method again to Pass in Char value.
			System.out.println("Huh");
			System.out.println("I can’t grade that. Try another grade");
			char redo = userInput.next().charAt(0);
			
			examGrader(redo);
		
	}
	}
}