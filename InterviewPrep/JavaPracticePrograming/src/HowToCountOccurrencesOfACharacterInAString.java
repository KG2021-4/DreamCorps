
public class HowToCountOccurrencesOfACharacterInAString {

	public static void main(String[] args) {
		String str = "KaalidGu";
		int totalremoved = str.replace("a","" ).length(); //Total Length after removing character
		int length = str.length(); //Total Length 
		int count =0;
		char c ='a';
		char [] array = str.toCharArray();
		for(int i=0; i<array.length;i++) {
			if(array[i]==c) {
				count++;
			}
		}
       System.out.println("The Character " + c + "occured " + count + " times");
       System.out.println("The Character " + c + "occured " + (length-totalremoved) + " times");
	}

}
