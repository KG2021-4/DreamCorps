import java.util.Scanner;

public class HowToCountWordsInAString {

	public static void main(String[] args) {
	   System.out.println("Enter a String");
	   Scanner sc = new Scanner(System.in);
	   //Approach 1
	   String s =sc.nextLine();
	   String strArray[]=s.split(" ");
	   System.out.println( strArray.length);
	   //Approach 2
	   int count =1;
	   for(int i=0; i<s.length(); i++) {
		  if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
			  count++;
			  
		  }
	   }
	   System.out.println("There are: " + count + "words in the String");

	}

}
