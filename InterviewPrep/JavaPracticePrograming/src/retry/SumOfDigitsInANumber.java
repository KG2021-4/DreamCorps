package retry;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		int num =1234;
		int sum = 0;
		// retreive each number % modulus
		// Add them together
		while(num>0) {
			//gets last digit
			int remainder = num %10;
			// adds sum
			sum+= remainder;
			// throws away remainder
			num =num/10;
		}
		System.out.println("sum is: " +sum );
   
	}

}
