package retry;

public class FindSumOFArrayElements {

	public static void main(String[] args) {
		int numbers [] = {1,2,3,4,6,7,8,9,10};
		// Range in there
	    int sum=0 ;
	    for(int i =0; i<numbers.length;i++) {
	    	sum += numbers[i];
	    }
	    System.out.println("sum is: " + sum);

	}

}
