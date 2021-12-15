package retry;

public class HowToCountOccurrencesOfACharacterInAString2 {

	public static void main(String[] args) {
		String string = "abcaac abc";
		int count =0;
		char find ='a';
//		char [] chars =string.toCharArray();
//		for(int i =0; i< chars.length; i++) {
//			if('a'==chars[i]) {
//				count++;
//			}
//		}
		for(int i= 0; i<string.length() ;i++ ) {
			if(find ==string.charAt(i) ) {
				count++;
			}
		}
		System.out.println("The character is reapeated: " + count + " times");
	}

}
