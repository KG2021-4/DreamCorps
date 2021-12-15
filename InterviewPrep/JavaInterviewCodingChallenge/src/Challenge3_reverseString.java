
public class Challenge3_reverseString {

	public static void main(String[] args) {
		//Approach 1 loop through String elemeents
		String st = "abcde";
		String reverse ="";
//		for(int i= st.length()-1;i>=0;i--) {
//			reverse= reverse+ st.charAt(i);
//		}
//        System.out.println(reverse);
		//Approach 2
//		 char [] c =st.toCharArray();
//		 for(int i =c.length-1;i>=0;i--) {
//			 reverse+= c[i];
//		 }
	
//		 System.out.println(reverse);
		//Approach 3;
		StringBuilder s = new StringBuilder(st);
		 s.reverse();
		 System.out.println(s);	
		//Approach 4;
		 StringBuffer s2 = new StringBuffer(st);
		 s2.reverse();
		 System.out.println(s2);		
	}
       
}
