
public class FibonacciSeries {

	public static void main(String[] args) {
		// 		Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
		  //intilaize varibles
		  int n1 = 0;
		  int n2 = 1;
		  //Loop through six times
		  for(int i =0; i<=6; i++) {
			  int sum = n1 +n2;
			  System.out.println(sum);
			  n1=n2;
			  n2=sum;
		  }

	}

}
