package retry;

import java.util.Random;

public class HowToGenerateRandomNumbersAndStringsRedo {

	public static void main(String[] args) {
	   Random random = new Random();
	   int num = random.nextInt(101);
	   System.out.println(num);
	   double num2 =  Math.random() *101;
	   System.out.println((int)num2);
	}

}
