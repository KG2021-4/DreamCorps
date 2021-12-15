import java.util.Scanner;

public class CheckGivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		//Prime number is Natural Number Greater Than 1
		//HAS TWO FACTORS 1 and Itself
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
	    int num = sc.nextInt();
	    int count=0;
	    
	    if(num>1) {
	    	//Check to see if Number is Greater than 1
	    	 for(int i =1; i<=num; i++) {
	 	    	if(num%i==0) {
	 	    		count++;
	 	    	}
	 	    }
	    	 if(count==2) {
	    			System.out.println("This is a Prime Number");
	    	 } else {
	    			System.out.println("Not a Prime Number");
	    	 }

	    } else {
	    	System.out.println("Not a Prime Number");
	    }
	    
	   	}

}
