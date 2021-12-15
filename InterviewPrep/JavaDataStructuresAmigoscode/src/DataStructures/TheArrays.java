package DataStructures;
//Arrays come from this o=package
import java.util.Arrays;

public class TheArrays {
//Arrays have fixed size
// Fast fir data retrival
// compact memory usage if size is known
// hard to delete operations
	public static void main(String [] args) {
		// If you dont know the number of elements use this way to initiliaze an Array
		String[] colors = new String[5];
		colors[0]= "purple";
		colors[1]= "blue";
		colors[2]= "yellow";
		colors[3]= "green";
		colors[4]= "orange";
		
		System.out.println(Arrays.toString(colors));
		
		
		// use this approach to initiliaze Array if you know the elements they will have.
		int [] numbers = {100,200};
		
		//loop through elements
		for(int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		// loops through elements in reverse
		for(int i = colors.length-1; i>=0; i--) {
			System.out.println(colors[i]);
		}
		
		// The length of you Array --> pritns array size
		System.out.println(colors.length);
		
		//loop through Array using enhanced for loop
		for(String color : colors) {
			System.out.println(color);
		}
		//loop through Array using 
		Arrays.stream(colors).forEach(System.out::println);
	}
	
}
