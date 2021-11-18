import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
	int []	numbers  = getRandomPopulatedArray(5);
	for(int i =0; i<numbers.length; i++) {
		System.out.print(numbers[i]);
		if(i<numbers.length-1) {
			System.out.print(",");
		}
	}
	System.out.println(Arrays.toString(numbers));
	}
public static int [] getRandomPopulatedArray(int x) {
	int numbers [] = new int[x];
	for(int i =0; i<numbers.length; i++) {
		numbers[i]+= (Math.random() *101) + 1;
	}
	return numbers;
}
}
