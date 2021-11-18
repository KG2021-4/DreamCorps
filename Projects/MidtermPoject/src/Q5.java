
public class Q5 {
public static void main(String [] args) {
	int [] numbers = {1,3,104,1738};
	System.out.println("The product of all the numbers in the array is " + getProduct(numbers));
	int [] numbers2 = {2,4,8,6,2,3};
	System.out.println("The product of all the numbers in the array is " +getProduct(numbers2));
}
public static int getProduct(int [] x) {
// Initialize variable n to 1;
	int n = 1;
	// Use for loop to traverse Array
	for(int i =0; i<x.length; i++) {
		// Reset the value n To multiply elements to each other for each iteration n gets multiplies to Array elements. 
	 n = n * x[i];
	 
}

	// return n
	return n;
}
}