
public class GenerateFibonacciseries {
public static void main(String [] args) {
	//0 1 2 3 5 8 13 21 34
	int num1 =0;
	int num2 =1;
	int sum=0;
	for(int i =0; i<10; i++) {
		sum = num1 + num2;
		System.out.println(sum);
		num1 =num2;
		num2 =sum;
		
	}
}
}
