
public class PrimeChecker {

	public static void main(String[] args) {
		//intialize a num to check
		int num = 3;
		int count = 0;
		for(int i =1; i<=num; i++) {
			// returns the reaminder of that  num
			if(num % i ==0) {
				count++;
		
		}
			
		}
		if(count ==2) {
			System.out.println(num +" is prime");
		} else {
			System.out.println(num +" is not prime");
		}

	}

}
