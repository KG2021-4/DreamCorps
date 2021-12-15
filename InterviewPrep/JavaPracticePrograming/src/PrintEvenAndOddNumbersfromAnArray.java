
public class PrintEvenAndOddNumbersfromAnArray {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5};
		//Loop and Print Even Numbers
		System.out.println("Even numbers are: ");
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]);
			
		}
			

	}  /* //Enhanced For Loop
		System.out.println("Even numbers are: ");
		for(int value: numbers) {
		  if(value %2 ==0) {
			  System.out.println(value);
		  }
		  */
		System.out.println("Odd numbers are: ");
		//Loop and Print Odd Number
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				System.out.println(numbers[i]);
			
		}

}

}
}