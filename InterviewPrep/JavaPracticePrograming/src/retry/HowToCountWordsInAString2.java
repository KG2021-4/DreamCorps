package retry;

public class HowToCountWordsInAString2 {

	public static void main(String[] args) {
		String string = "Khalid Emlily Dog";
		int count =1;
//		String [] str =string.split(" ");
//		System.out.println("The number of words are : " + str.length);
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)==' '&& string.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println("The number of words are : " + count);

	}

}
