import java.util.Scanner;

public class CountNumberOFODDAndEvenDigitsInANumber {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
    int num = sc.nextInt();
    int countOdd =0;
    int countEven =0;
    while(num>0) {//1234
    	//Get the last digit value if num = 1234 it would be 4
    	int remandier =num%10;//4
    	if(remandier %2 ==0) {
    		countEven++;//1
    	} else {
    		countOdd++;
    	}
    	//removes last digits from num;
    	num =num/10;//123
    }
    System.out.println("Number of Even is " + countEven +" Number of ODD is " + countOdd );
}
}
