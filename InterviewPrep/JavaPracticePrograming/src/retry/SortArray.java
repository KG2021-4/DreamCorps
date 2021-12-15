package retry;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int num [] = {1,2,4,-1,8,88};
		System.out.println("Before Swap " + Arrays.toString(num));
		int temp = 0;
		for(int i =0; i< num.length ; i++) {
			for(int j= i+1; j<num.length; j++) {
				
				if(num[i]>num[j]) {
					System.out.println("Before Swap " + Arrays.toString(num));
					temp =num[i];
					num[i]=num[j];
					num[j] =temp;
					System.out.println("Before Swap " + Arrays.toString(num));
				}
			}
		}
		System.out.println("After Swap " + Arrays.toString(num));

	}

}
