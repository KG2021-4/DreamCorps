import java.util.ArrayList;
import java.util.Scanner;

//# Put values from user into an ArrayList and multiply the values


public class ReadyToCode {


    //your code here
public static int getProductOf2(ArrayList<Integer> array1, ArrayList<Integer> array2) {
	
	  int n =1;
	    //traverse the ARRAYLIST 
	    for(int i =0; i<array1.size(); i++) {
	    	n =n * array1.get(i);
	    }
	
	  int n2 =1;
	   //traverse the ARRAYLIST 
	    for(int i =0; i<array2.size(); i++) {
	    	n2 =n2 * array2.get(i);
	    }
	   int result = n * n2;
	    return result;
}

  public static void main(String[] args) {
  //your code here
   
//	  initliaze Scanner to get user Input
//	  Display user to enter how values they want ArrayList
//	  Get their using a Loop Add to ther ArrayList
	  Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> number = new 	ArrayList<Integer>();
	  System.out.println("What is the Number of values you wish to add");
	  int num = sc.nextInt();
	  System.out.println("Enter " + num + "values");
	  for(int i=1;i<=num;i++) {
		
		 int num2= sc.nextInt();
		 number.add(num2);
	
	  }
	 
	
	  ArrayList<Integer> number2 = new 	ArrayList<Integer>();
	  System.out.println("What is the Number of values you wish to add For the Second Array List ");
	  int num4 = sc.nextInt();
	  System.out.println("Enter " + num + "values");
	  for(int i=1;i<=num;i++) {
		
		 int num5= sc.nextInt();
		 number2.add(num5);
	
	  }
	  int product = getProductOf2(number,number2);
	  System.out.println("The product of 2 ArrayList is " +product);
	  
//	   System.out.println(number);
//       // declare a num variable and intialize to 1
//	    int n =1;
//	    //traverse the ARRAYLIST 
//	    for(int i =0; i<number.size(); i++) {
//	    	n =n * number.get(i);
//	    }
//	    System.out.println(n);
//	    if(n % 2==0) {
//	    	System.out.println("This is EVEN");
//	    } else {
//	    	System.out.println("This is ODD");
//	    }
//         
//    }

    
    
  }
  }
