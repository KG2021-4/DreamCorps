package retry;

public class HowToFindMaximumAndMinimumValuesinArrayRedo {

	public static void main(String[] args) {
		int numbers [] = {1,2,32,4,5};
		int min = numbers[0];
		int max = numbers[0];
		for(int i =0; i< numbers.length;i++) {
			if(numbers[i]>max) {
				max =numbers[i];
			}
			if(numbers[i]<min) {
				min =numbers[i];
			}
		}
       System.out.println("min of Array is: " + min);
       System.out.println("max of Array is: " + max);
	}

}
