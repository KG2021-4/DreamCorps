import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(4);
		array.add(6);
		array.add(8);
		multiplyby3(array);
		ArrayList<Integer> array2 = new ArrayList<Integer>();
//		array2 = getRandomPopulatedArray(2);
//		System.out.print(array2);
//		array2 = reSize(array);
//		System.out.println(array2);
//		array.get(0);
		array2 =subList(array, 1, 3);
		System.out.println(array2);
	}

	public static void multiplyby3(ArrayList<Integer> array1) {
		for (int i = 0; i < array1.size(); i++) {
			int num = array1.get(i) * 3;
			System.out.println(num);
		}

	}

	public static ArrayList<Integer> reSize(ArrayList<Integer> array1) {

		ArrayList<Integer> array2 = new ArrayList<Integer>();

		for (int i = 0; i < array1.size(); i++) {
			array2.add(array1.get(i));

		}
		while (array2.size() < array1.size() * 2) {
			array2.add(0);

		}

		// eementData = Arrays.copyOf(elementData, newCapaicty);
		return array2;
	}

	public static boolean equalArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		boolean equalOrNot = true;
		if (array1.size() == array2.size()) {
			for (int i = 0; i < array1.size(); i++) {
				if (array1.get(i) != array2.get(i)) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		return equalOrNot;

	}
   //
	public static ArrayList<Integer> getRandomPopulatedArray(int value) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (array.size() < value) {
			int n = (int) (Math.random() * 101);
			array.add(n);

		}
		return array;
	}
// Search ArrayList to find a target return index if it exists else return -1 for empty
	public static int search(ArrayList<Integer> array1, int s) {
		for (int i = 0; i < array1.size(); i++) {
			if (array1.get(i).equals(s)) {
				return i;
			}
		}
		return -1;
	}
	// SubList Implementation 
   public static ArrayList<Integer> subList(ArrayList<Integer> s, int indexStart, int indexEnd){
	   //initialize ArrayList to store sublist elements based on range entered. 
	   ArrayList<Integer> array = new ArrayList<Integer>();
	   for(int i = indexStart; i<indexEnd; i++) {
		   int r = s.get(i);
		   array.add(r);
		   
	   }
	   return array;
   }
}
