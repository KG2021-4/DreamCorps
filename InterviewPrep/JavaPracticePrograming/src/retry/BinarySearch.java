package retry;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int arrayBinarySearch(int [] array, int num) {
		int lowerBound =0;
		int higherBound = array.length-1;
		while(lowerBound<=higherBound) {
			int mid = (higherBound+ lowerBound)/2;
			if(array[mid]==num) {
				System.out.println("Element found .. at index: " +mid);
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
	}

}
