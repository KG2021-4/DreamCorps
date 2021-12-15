import java.util.Arrays;

public class SortElementsInArrayUsingBubbleSort {

	public static void main(String[] args) {
		int numbers[]= {4,2,1,5,3};
		System.out.println(Arrays.toString(numbers));
		int n = numbers.length;
		for(int i =0; i<n-1; i++) {
			for(int j =0; j<n-1; j++) {
				System.out.println("here is i "+i);
				if(numbers[j]>numbers[j+1]) {
					System.out.println("here is j "+j);
					
					int temp =numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
