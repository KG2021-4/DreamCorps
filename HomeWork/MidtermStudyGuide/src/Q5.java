
public class Q5 {
public static void main(String [] args) {
	String finder = "Elephhnyt";
	System.out.println(search(finder, 'a'));
	;
	
}
public static int search(String word, char target) {
	char [] c = word.toCharArray();
	for(int i =0; i< c.length; i++) {
		if(c[i]==target) {
			return i;
		}
	}
	return -1;
}
}
