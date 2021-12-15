
public class HowToFindMaximumAndMinimumValuesinArray {
public static void main(String [] args) {
	int numbers [] = {1,10,22,3,1,55,66};
	int min =numbers[0];
	int max=numbers[0];
	
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]>max) {
			max =numbers[i];
		}
	}
	System.out.println("Max is: " + max);
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]<min) {
			min =numbers[i];
		}
	}
	System.out.println("Min is: "+ min);
}
}
