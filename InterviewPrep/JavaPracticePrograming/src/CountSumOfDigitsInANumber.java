
public class CountSumOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 1234;
		int total =0;
		while(num>0) {
			//Get the last digits of number
			int remainder = num%10;//
			//Add that to the total
			total+=remainder;// 4+3+2+1
			// Remove digit from num
			num=num/10; // 123 12 1 20
		}
		System.out.println("total is: " +total );
	}
 
}
