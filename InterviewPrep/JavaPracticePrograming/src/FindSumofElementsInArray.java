
public class FindSumofElementsInArray {
public static void main(String [] args) {
	int numbers [] = {1,2,3,4,5};
//	int sum =0;
//	for(int i =0;i<numbers.length;i++) {
//		sum=sum+numbers[i];
//	}
	//Enhanced For Loop
 /*for(int value:numbers){
	sum+=value;
} */
	
	int sum =adder(numbers);
	System.out.println("Sum of Array Elements is: " + sum);
}
public static int adder(int [] array) {
	int sum =0;
	for(int i =0;i<array.length;i++) {
		sum=sum+array[i];
	}
	return sum;
}
}
