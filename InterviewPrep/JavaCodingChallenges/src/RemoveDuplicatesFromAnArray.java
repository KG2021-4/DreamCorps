import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		//Decalre and initlaize an Integer Array
		int num [] = {1,2,2,4,5,6};
		//Use a Nested for loop to compare values
		for(int i =0; i<num.length; i++) {
			for(int j = i+1; j<num.length;j++) {
				if(num[i]==num[j]) {
					num[j] =0;
				    
				}
			
		}
		}
		System.out.println(Arrays.toString(num));
	}
	

}
