import java.util.Scanner;

public class FindLargestOf3Numbers {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
    int num = sc.nextInt();
    System.out.println("Enter second number");
    int num2 = sc.nextInt();
    System.out.println("Enter third number");
    int num3 = sc.nextInt();
   /* 
   if(num>num2&&num>num3) {
	   System.out.println(num +" Is the Largest Number");
   }else if(num2>num&&num2>num3) {
	   System.out.println(num2 +" Is the Largest Number");
   } else {
	   System.out.println(num3 +" Is the Largest Number");
   }
   */
    //Ternary Operator
    int largestOfTwoNumbers = num>num2?num:num2;//Largest of firstnum and second num
    int largestOfThreeNumbers = largestOfTwoNumbers>num3?largestOfTwoNumbers:num3; //largest of third number compared to greater of two numbers
    
    System.out.println(largestOfThreeNumbers +" Is the Largest Number");
}
}
