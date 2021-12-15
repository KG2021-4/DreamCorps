package retry;

public class reverseNumber {

	public static void main(String[] args) {
	   int num= 1234;
	   int rev = 0;
	   while(num>0) {
		   rev = rev*10 + num%10;
		   //123 12 1 0
		   num =num /10;
	   }
	   System.out.println(rev);
	}

}
