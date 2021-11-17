package Curr;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// Declare Variables to store Foreign Currency
		double mexicanPeso;
		double guatemalanQuetzals;
		double salvadoranColóns;
		// Declare CONSTASNT Variables to STORE USD Exchange Rates
		final double PESOCONVERT = 0.0544;
		final double QUETZALCONVERT = 0.1305;
		final double COLONCONVERT = 0.1144;
		// Initialize Scanner
		Scanner scan = new Scanner(System.in);
		// Prompt user to enter number of currency and use dot operator to call
		// nextDouble() METHOD TO get input and store in each Variables.
		System.out.println("Enter number of Mexican Pesos:");
		mexicanPeso = scan.nextDouble();
		System.out.println("Enter number of Guatemalan Quetzals:");
		guatemalanQuetzals = scan.nextDouble();
		System.out.println("Enter number of Salvadoran Colóns:");
		salvadoranColóns = scan.nextDouble();
		// Multiply user input with Exchange rate to Convert foreign currency to USD.
		double pesoToUSD = mexicanPeso * PESOCONVERT;
		double quetzalToUSD = guatemalanQuetzals * QUETZALCONVERT;
		double colónsToUSD = salvadoranColóns * COLONCONVERT;
		// ADD all THREE CURRENCY TO GET TOTAL USD & USE MATH.ROUND METHOD TO ROUND TO
		// THE Nearest WHOLE NUMBER TIMES 100
		// DIVDE by 100.00 to get 2 decimal Point
		double totalUSD = Math.round((pesoToUSD + quetzalToUSD + colónsToUSD) * 100) / 100.00;
        // Print result to the Screen in requested format
		System.out.println("US Dollars = " + totalUSD);

	}

}
