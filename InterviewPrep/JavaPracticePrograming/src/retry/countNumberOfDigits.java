package retry;

public class countNumberOfDigits {

	public static void main(String[] args) {
	// intizialize a num variable  
		int num = 1234;
		int count =0;
		
		while(num>0) {
			//increments count by one
			count++;
			// 123 12 1 0
			//go to zero each time we loop
			num =num/10;
		}
      System.out.println("The number of digits is " + count);
	}

}
