package retry;

public class countNumberOfEvenAndODD {

	public static void main(String[] args) {
	  int num = 13711;
	  int even_Count =0;
	  int odd_Count =0;
	  //We want to look at each number 
	  //Test to see if it is even or odd
	  while(num>0) {
		  // 4 3 2 1
		  int remainder = num %10;
		  if(remainder %2==0) {
			 even_Count++;
		  } else {
			  odd_Count++;
		  }
		  
		  // remove the last digit
		  num = num/10;
	  }
      System.out.println("Even Digits Are: "+even_Count );
      System.out.println("odd Digits Are: "+ odd_Count );
      
	}

}
