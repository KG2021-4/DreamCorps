
public class FactorialOfANumber {
public static void main(String [] args) {
	//OUTPUT = 5*4*3*2*1=120
	int num = 5;
//	int n =1;
//
//	for(int i=1; i<=num; i++) {
//		n=n*i;
//	}
	findFactorialOfANumber(num);
	
	
}
public static void findFactorialOfANumber(int num) {
	int n =1;

	for(int i=1; i<=num; i++) {
		n=n*i;
	}
	System.out.println("Factorial is: " + n);
	
}
}
