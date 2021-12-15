
public class HowToRemoveJunkorSpecialCharactersInString {
public static void main(String [] args) {
	
	String s ="66 Khalid Guled";
	System.out.println(s);
	String change =s.replaceAll("6 6", "");
	System.out.println(change);
	
}
}
