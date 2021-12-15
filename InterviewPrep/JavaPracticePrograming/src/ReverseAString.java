import java.util.Scanner;

public class ReverseAString {
	public static void main(String [] args) {
		//1) use String concatentation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String rev = "";
		String string = sc.nextLine();
		/*//String empty

		for(int i=string.length()-1; i>=0;i--) {
			rev += string.charAt(i);
		}
		System.out.println("Reverse is " + rev );
		
		*/
		//use char Array;
		 /*char [] a = string.toCharArray();
		int length =a.length;
		for(int i =length -1; i>=0; i--) {
			rev = rev +a[i];
		}
		System.out.println("Reverse is " + rev );
		*/
		//StringBudder class;
		StringBuffer s = new StringBuffer();
		s.append(string);
		StringBuffer rev1 =s.reverse();
		
		System.out.println("Reverse is " + rev1);

	}

}
 