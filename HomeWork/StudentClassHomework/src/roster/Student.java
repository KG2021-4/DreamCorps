package roster;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// DECLARE VARIABLES 
		String fullName;
		int credits;
		double gpa;
		String school;
		String major;
		String emailAddress;
        // Initialize Scanner
		Scanner scan = new Scanner(System.in);
		// Get User Input
		// 
		System.out.println("ENTER FULL NAME");
		fullName = scan.nextLine();
		System.out.println("ENTER credits");
		credits = scan.nextInt();
		System.out.println("ENTER GPA");
		gpa = scan.nextDouble();
		System.out.println("ENTER School");
		scan.nextLine();
		school = scan.nextLine();
		System.out.println("ENTER Major/ PRESS ENTER IF YOU HAVE Not chosen a Major");
		major = scan.nextLine();
		System.out.println("ENTER Email Address");
		emailAddress = scan.nextLine();
		// IF CONIDITON WITH TO DETERMINE IF STUDENT IS ELIGIBLE TO GRADUATE
		if (credits >= 120 && gpa >= 2.5) {
			// INFORM STUDENTS IN CONSOLE THEY CAN GRADUATE
			System.out.println("Congrats " + fullName + " You are  eligilble for graduation since you have: "
					+ credits + " credits" + "And a GPA of: " + gpa);
			// INFORM THEM THEY ARE NOT eligilble TO GRAD
		} else {
			System.out.println("Hello " + fullName
					+ " You are not eligilble for graduation since you need to have a GPA of 2.5 or Greater and at least 120 credits You have:"
					+ credits + " credits " + " And a GPA of: " + gpa);

		}
		// IF CONDITON TO DETERMINE IF STUDENT HAS DECLARED MAJOR AFTER 60 credits and REMIND THEM IF NOT.
		if (credits >= 60 && major.length() == 0) {
			System.out.println("REMINDER TO DECLARE TO MAJOR SINCE YOU HAVE 60 credits or More");
		}

	}

}
