
public class FindMissingNumberinanArray {
public static void main(String [] args) {
	int numbers[]= {1,2,4,5};
	int num=0;
	int sum =0;
	//Array SHOULD NOT HAVE DUPLICATED
	// NO NEED TO BE IN ORDER
	// VALUES SHOULD BE IN RANGE 1-5
	
	//FIND THE SUM OF CURRENT ARRAY
	for(int value: numbers) {
		sum+=value;
	}
	//Find total of all Array Elements form range 1-5 
	for(int i=5; i>=1;i--) {
	  num=num+i;
	}
	//subtract the two sum to get missing number
	int missingNum = num-sum;
	System.out.println("Missing Number is " + missingNum);
}
}
