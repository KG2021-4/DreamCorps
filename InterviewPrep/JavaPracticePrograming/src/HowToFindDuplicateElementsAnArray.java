import java.util.HashSet;

public class HowToFindDuplicateElementsAnArray {

	public static void main(String[] args) {
		int numbers [] = {1,2,4,4,5,6};  
		//Approach 1
		//Nested For Loop
	   /* int count =0;
        for(int i =0; i<numbers.length; i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		if(numbers[i]==numbers[j]) {
        			count++;
        			 System.out.println("Duplicate element is " + numbers[i]);
        		}
        	}
        }
          if(count ==0) {
        	  System.out.println("There are no Duplicate Elements");
          }
	}
	 */
		//Approach 2
		//HashSet Does not allow for Duplicate values
		findDuplicates(numbers);
		boolean flag = false;
		HashSet<Integer> l = new HashSet<>();
        for(int value: numbers) {
        	if(l.add(value)==false) {
        		 System.out.println("Duplicate element is " + value);
        		 flag=true;
        	}
        }
        if(flag==false) {
        	System.out.println("There are no Duplicate Elements");
        }
}
	public static void findDuplicates(int [] array) {
		   boolean flag =false;
		for(int i =0; i<array.length; i++) {
	        	for(int j=i+1;j<array.length;j++) {
	        		if(array[i]==array[j]) {
	        			
	        			 System.out.println("Duplicate element is " + array[i]);
	        			 flag=true;
	        		}
	        	}
	
}
		if(flag==false) {
			System.out.println("There are no Duplicate Elements");
		}
	}
	
}
