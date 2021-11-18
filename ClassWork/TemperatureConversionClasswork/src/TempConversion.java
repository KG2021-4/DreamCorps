import java.util.Scanner;
	

	/**
	 * Converts inches to centimeters.
	 */
	public class TempConversion {
	
	    public static void main(String[] args) {
	        double cm;
	        double inches;
	       
	        
	        //Ask user to input number of inches 
	        Scanner userInputInches = new Scanner(System.in);

	       
	        System.out.print("Exactly how many inches? ");
	        //Store info inputted by user
	        
	        inches = userInputInches.nextDouble();
	        //Take info stored and use expression to convert inches to centimeters 
	        
	        //expression 
	        double convertToCenti = inches * 2.54;
	        
	        //Print out the result of the expression 
	        System.out.println(convertToCenti);

	       
	    }
	

	}
