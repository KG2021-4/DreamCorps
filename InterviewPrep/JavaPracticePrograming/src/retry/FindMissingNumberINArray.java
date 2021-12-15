package retry;

public class FindMissingNumberINArray {

	public static void main(String[] args) {
		int numbers [] = {1,2,3,4,6,7,8,9,10};
		// Range in there
	    int sum=0 ;
	    for(int i =0; i<numbers.length;i++) {
	    	sum += numbers[i];
	    }
        int factorailSum =0;
        for(int i =1; i<=10; i++) {
        	factorailSum += i;
        }
        int missingNumber = factorailSum -sum;
        System.out.println("Missing Number in the Array is: " + missingNumber);
	}   

}
