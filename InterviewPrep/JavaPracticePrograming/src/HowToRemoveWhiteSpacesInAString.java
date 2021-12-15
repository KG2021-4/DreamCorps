
public class HowToRemoveWhiteSpacesInAString {

	public static void main(String[] args) {
		String str= "Java   Programming  selenium automation";
		System.out.println(str);
		str.replaceAll("\\s+","");
		System.out.println(str);

	}

}
