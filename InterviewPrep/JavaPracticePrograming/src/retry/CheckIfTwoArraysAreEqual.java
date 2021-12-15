package retry;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		int num1 [] = {1,2,3,4,5,6,7,8,9,10};
		int num2 [] = {1,2,3,4,5,6,7,8,9,10};
//         boolean check = Arrays.equals(num1, num2) ;
//         if(check ==true) {
//        	 System.out.println("Arrays are Equal");
//         } else {
//        	 System.out.println("Arrays are not Equal");
//         }
//         
	   // boolean variable to store if is equal
//		boolean arrayEqual = true;
//		if(num1.length == num2.length) {
//			//travers the Array
//			for(int i= 0; i<num1.length; i++) {
//				if(num1[i]!= num2[i]) {
//					arrayEqual =false;
//					break;
//				}
//			}
//		}else {
//			arrayEqual =false;
//		}
		boolean arrayEqual =findCheckIfTwoArraysAreEqual(num1,num2);
		if(arrayEqual==true) {
			 System.out.println("Arrays are Equal");
		} else {
			 System.out.println("Arrays are not Equal");
		}
		
	}
	public static boolean findCheckIfTwoArraysAreEqual(int [] num1, int [] num2) {
		boolean arrayEqual = true;
		if(num1.length == num2.length) {
			//travers the Array
			for(int i= 0; i<num1.length; i++) {
				if(num1[i]!= num2[i]) {
					arrayEqual =false;
					break;
				}
			}
		}else {
			arrayEqual =false;
		
	}
		return arrayEqual;

}
}
