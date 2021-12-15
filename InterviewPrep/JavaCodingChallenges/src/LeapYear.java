import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find if a year is a leap year or not. Just to recap, 
		 * a leap year is a year with 366 days which is 1 extra day than a normal year. 
		 * This extra day comes in the month of February and on leap year Feb month has 29 days than normal 28 days. 
		 * If you are following then you might know that leap year comes in an interval of 4 years. 
		 * The year 2012 is a leap year and Feb has 29 days, you can check.

		 */
        //2012,2016,2020,2024h, 2028
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		int daysInYear = Year.of( year ).length();
		if(daysInYear==366) {
			System.out.println("THIS IS A LEAP YEAR");
		} else {
			System.out.println("THIS IS NOT A LEAP YEAR");
		}
//		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//            System.out.println(year + " is a Leap Year");
//       else
//            System.out.println(year + " is not a Leap Year");
//   
//	}
	
}
}