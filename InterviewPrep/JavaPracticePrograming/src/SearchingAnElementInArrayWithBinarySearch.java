import java.util.Arrays;

public class SearchingAnElementInArrayWithBinarySearch {
	public static void main(String [] args) {
		//Element must be in Sorted order
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		boolean flag = false;
		int num=10;
		int lowerBound =0;
		int higherBound =array.length-1;
		//the index that left is pointing at is less than or equal to right
		//Why? If left surpasses right, we have searched the entire array
		while(lowerBound<=higherBound) {
			int mid=(lowerBound+higherBound)/2;
			if(array[mid]==num) {
				System.out.println("Element found .. at index: " +mid);
				flag=true;
				break;
			} 
			//if target value greater than the value at the middle index
			//increase the left pointer index by 1
			if((num> array[mid])) {
				lowerBound=mid+1;
			} 
			//// if target value is less than the value at the middle index
			// decrease the right pointers index by 1
			if(num < array[mid]) {
				higherBound=mid-1;
			} 
			
		}
		if(flag==false) {
			System.out.println("Element not found .. at index is " + -1);
		}
		//Approach 2
		Arrays.binarySearch(array, 10);
		System.out.println(Arrays.binarySearch(array, 10));
	}

}
