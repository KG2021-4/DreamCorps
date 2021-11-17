import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

	public static int size = 10;
	public static int[] array = new int[size];

	public static int[] b = new int[size];

	public static void main(String[] args) {
		array[0] = 10;
		array[1] = 12;
		array[2] = 13;
		array[3] = 14;
		array[4] = 15;
		array[5] = 16;
		array[6] = 17;
		array[7] = 18;
		array[8] = 19;
		int a[] = sort(array);
		int b[] =reverse(array);
		
		System.out.println(get(0));
		System.out.println(indexOf(22));
		System.out.println(contains(314));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
//			set(0,1738);
//			System.out.println(get(0));

//			System.out.println(Arrays.toString(array));
//			remove(0);
//			System.out.println(Arrays.toString(array));
//			System.out.println(Arrays.toString(array));
//			System.out.println(Arrays.toString(b));

//			
//			System.out.println(Arrays.toString(array));
//			System.out.println(Arrays.toString(b));

		ArrayList<Integer> n = new ArrayList<Integer>();

	}

	// INDEX OF
	public static int indexOf(int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}

		}
		return -1;
	}

	// Contains
	public static boolean contains(int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return true;
			}

		}
		return false;

	}

	// Sort
	public static int[] sort(int[] x) {
		int[] array2 = new int[x.length];
		int temp = 0;
		for (int i = 0; i < x.length; i++) {
			// TAKE THE FIRST ELEMENT AND COMAPER TO ALL ELEMEENTS IN TJE LOOP
			for (int j= i; j < x.length; j++) {
				
				if (x[i] > x[j]) {
					
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			for(int k =0; k<x.length; k++) {
				array2[k] = x[k];
			}
		}
          return array2;
	}
	//Reverse
	public static int[] reverse(int[] realArr) {
	    // declare variables
	    int size = 0;
	    int reverseArr[];
	    // find length of the given array
	    size = realArr.length;
	    // temporary array of the same size
	    reverseArr = new int[size];
	    // find reverse and store to temporary array
	    // initialize iterator variables
	    // I STARTS AT FIRST INDEX OF REVERSEARR
	    int i = 0;
	    // STARTS AT THE LAST INDEX OF REAL ARRAY
	    int j = size-1;
	    while(i < size) {
	      // assign element
	      reverseArr[i] = realArr[j];
	      // update iterator variables
	      // ADD 1
	      i++;
	      //SUBTRACT 1
	      j--;
	    }
	    return reverseArr;
	}
	//Copy
	public static int[] copyArray(int[] x) { 
		int [] copyArray; copyArray = new int[x.length]; 
		for (int i = 0; i < x.length; i++) { 
			copyArray[i] = x[i]; 
		
		} 
		return copyArray; 
		}
	// .get()
	public static int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}

	// .set()
	public static int set(int index, int element) {
		int old = get(index);
		array[index] = element;
		return old;
	}

	// .add()
	public static boolean add(int element) {
		if (size >= array.length) {
			// make a bigger array and copy over the elements
			int[] bigger = (int[]) new int[array.length * 2];
			System.arraycopy(array, 0, bigger, 0, array.length);
			array = bigger;
		}
		array[size] = element;
		size++;
		return true;
	}

	public static void add(int index, int element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		// add the element to get the resizing
		add(element);
		// shift the other elements
		for (int i = size - 1; i > index; i--) {
			array[i] = array[i - 1];
		}
		// put the new one in the right place
		array[index] = element;
	}

	// .remove()
	public static int remove(int index) {
		int element = get(index);
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
		return element;
	}
}
