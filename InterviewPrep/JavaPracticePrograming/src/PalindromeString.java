import java.util.Scanner;

public class PalindromeString {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String s = sc.nextLine();
	String rev= "";
	for(int i =s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	System.out.println("The reverse is: " + rev);
	if(s.equalsIgnoreCase(rev)) {
		System.out.println( s +"Is a  PalindromeString");
	}
}
   
}
