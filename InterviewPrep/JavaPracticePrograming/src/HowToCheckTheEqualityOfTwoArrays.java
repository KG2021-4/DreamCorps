import java.util.Arrays;

public class HowToCheckTheEqualityOfTwoArrays {

	public static void main(String[] args) {
		int numbers [] = {1,2,3,4,5};  
		int numbers2 [] = {1,2,3,4,5};  
		// Check to see if the Length are Equal
		//Check to see if elements are Equal at each index
		boolean status  = true;
		if(numbers.length==numbers2.length) {
			for(int i= 0; i<numbers.length;i++) {
				if(numbers[i]!=numbers2[i]) {
					status=false; 
				}
			}
		} else {
			status=false;
		}
		
	     if(status==true) {
	    	 System.out.println("They are Both Equal");
	     } else {
	    		System.out.println("They not Equal");
	     }
		
//		if(Arrays.equals(numbers, numbers2)) {
//			System.out.println("They are Both Equal");
//		} else {
//			System.out.println("They not Equal");
//		}
	}
	    
	   
	    
	
}