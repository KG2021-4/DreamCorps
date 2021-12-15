
public class Challenge4_reverseAnInteger {
public static void main(String [] args) {
	int num =1234;
	int reverse =0;
	//Must have range in
	while(num>0) {
		//num %10 get us last digit
		//reverse *10 - push the exsists reverse value mulitply by 10 to add it to revers value
		reverse = reverse *10 + num%10;
		//num/10 removes last digit
		num = num/10;
		if(reverse> Integer.MAX_VALUE||reverse<Integer.MIN_VALUE) {
			System.out.println("Exceed Range");
		}
	}
	System.out.println(reverse);
}
}
