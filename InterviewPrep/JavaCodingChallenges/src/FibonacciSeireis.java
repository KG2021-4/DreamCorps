
public class FibonacciSeireis {

	public static void main(String[] args) {
		//  1 1 2 3 5 8 13
		int n1=0;
		int n2=1;
		for(int i =1;i<=7; i++) {
			int sum = n1+n2;
			System.out.println(sum);
			n1 = n2;
			n2 =sum;
		}

	}

}
