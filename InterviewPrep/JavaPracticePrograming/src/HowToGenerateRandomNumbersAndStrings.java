import java.util.Random;

public class HowToGenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
	//Approach 1
	 Random r= new Random();
	 //Range is 0-100
	 int number = r.nextInt(101);
	
	 System.out.println(number);
	//Appoach 2
	 //Range is 0-100
	 int number2 =(int) (Math.random()*101);
	 System.out.println(number2);
	 
	 
	}

}
