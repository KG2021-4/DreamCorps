package retry;

public class reverseAstring {

	public static void main(String[] args) {
		String k ="abcd";
		String reverse = "";
		for(int i =0; i<k.length();i++){
			reverse = k.charAt(i) + reverse;
		}
		System.out.println(reverse);
	}

}
