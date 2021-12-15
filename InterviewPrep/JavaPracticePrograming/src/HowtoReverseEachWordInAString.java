import java.util.Scanner;

public class HowtoReverseEachWordInAString {
//Return
	public static void main(String[] args) {
		System.out.println("Enter a String");
		   Scanner sc = new Scanner(System.in);
		   //Approach 1
		   String s =sc.nextLine();
		   String reversedString ="";
		   String []  sToArray = s.split(" ");
		   String [] sToArray2 = new String[sToArray.length];
		   for(String w: sToArray) {
			   String reversedWord ="";
			   for(int j = sToArray.length-1; j>=0; j--) {
				   reversedWord=reversedWord+w.charAt(j);
			   }
			   reversedString =reversedString +reversedWord+ " ";
		   }
		   System.out.println(reversedString);
	}

}
