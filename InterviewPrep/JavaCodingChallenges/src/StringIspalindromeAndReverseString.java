
public class StringIspalindromeAndReverseString {

	public static void main(String[] args) {
		String name ="rwwr";
//		String reverse ="";
//		for(int i =0; i<name.length(); i++) {
//			reverse = name.charAt(i) + reverse;
//		}
//		System.out.println(reverse);
//
//		if(name.equalsIgnoreCase(reverse)) {
//			System.out.println("Palindorme");
//		} else {
//			System.out.println("Not Palindorme");
//		}
		boolean flag = true;
		int end = name.length()-1;
		for(int i =0; i<name.length()-1; i++) {
			if(name.charAt(i)!=name.charAt(end-i)) {
				System.out.println("Not Palindorme");
				flag= false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("is Palindorme");

		}
		
	}

}
