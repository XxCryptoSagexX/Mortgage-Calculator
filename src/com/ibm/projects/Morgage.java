package com.ibm.projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class Morgage {

	public static void main(String[] args) {
		// float -- Principal: Amount of loan
		// float -- Annual intrest rate:  divide this by 100 then divide by 12
		// Int - Period Years of loan : multiply by twelve
		// String - Morgage: format to string
		
		
		/*
		 * Scanner was only needed once in this application 
		 * Variable names should have been expressed to cause less confusion
		 * Potentially assigning dedicated numbers for months in year and Percent instead of 12 and 100
		 */

		Scanner scn1 = new Scanner(System.in);
		System.out.print("Principal: ");
		float principal = scn1.nextFloat(); //<--- Int would have been fine here. 
	
		Scanner scn2 = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		float apr = scn2.nextFloat();
		float mpr = (apr/100) / 12;
		
		Scanner scn3 = new Scanner(System.in);
		System.out.print("Period (Years): ");
		int yprd = scn3.nextInt(); //<--- BYTE would have been better since the years limit would have been 30. 
		int mprd = yprd * 12;
		
		/*
		 * Morgage =  principal * (mpr * Math.pow((1+mpr),mprd)) / (Math.pow((1+mpr),mprd)-1;
		 */
		float t = (float) (mpr * (float)Math.pow((1+mpr),mprd));
		float b = (float) (Math.pow((1+mpr),mprd)-1);
		float s = t/b;
		float morgage = principal * s;
		
		String result = NumberFormat.getCurrencyInstance().format(morgage);
		System.out.println("Mortgage: " + result );
		
		System.out.println("**** Test Case Notes ****");
		System.out.println("Your Principal is: " + principal);	
		System.out.println("Your MPR is: " + mpr);
		System.out.println("Your Monthly Period is: " + mprd);
		System.out.println("top: " + t);
		System.out.println("bottom: " + b);
		System.out.println("tbResult: "+ s);
		
	
/*		
 * This test case was to verify that the logic was correct when using Math.pow() function
		
		System.out.println("**** Test Case ****");
		float tTest = (float) (0.005 * (float)Math.pow((1+0.005),180));
		float bTest = (float) (Math.pow((1+0.005),180)-1);
		float answerTest = tTest / bTest;
		float mort = 100000 * answerTest;
		
		System.out.println("top: " + tTest);
		System.out.println("bottom: " + bTest);
		System.out.println("tbResult: "+ answerTest);
		
		String result = NumberFormat.getCurrencyInstance().format(mort);
		System.out.println("Mortgage: " + result );
*/
	}

}
