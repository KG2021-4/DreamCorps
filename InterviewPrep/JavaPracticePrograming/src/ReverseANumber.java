import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER TO REVERSE");
		Integer num = sc.nextInt();
		/*
		 * int rev =0; // Use algorithim 
		 * while(num!=0) { rev =rev *10 + num%10; num
		 * =num/10; } 
		 * 
		 * System.out.println("REVERSE is " + rev);
		 */
		/*
		 * //Use StringBuffer reverse method StringBuffer s = new StringBuffer();
		 * s.append(num); StringBuffer rev = s.reverse();
		 * System.out.println("REVERSE is " + rev);
		 */
		//Use String Builder
		StringBuilder s = new StringBuilder();
		s.append(num);
		StringBuilder rev = s.reverse();
		System.out.println("REVERSE is " + rev);

	}
}