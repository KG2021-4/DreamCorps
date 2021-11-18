import java.util.Arrays;

public class Q6 {
public static void main(String[] args) {
	int [] numbers = {55,33,3};
	int [] y = reSize(numbers);
	System.out.println(Arrays.toString(y));

	}
public static int[] reSize(int[] x) {
	 int y [] = new int[x.length *2];
	 for(int i =0; i<x.length ;i++) {
		 y[i] = x[i];
	 }
	 return y;
}
}
