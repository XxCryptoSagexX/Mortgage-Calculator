package com.ibm.exercise1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Morgage {

	public static void main(String[] args) {
		// double -- Principal: Amount of loan
		// double -- Annual intrest rate:  divide this by 100 then divide by 12
		// Int - Period Years of loan : multiply by twelve
		// String - Morgage: format to string

		Scanner scn1 = new Scanner(System.in);
		System.out.print("Principal: ");
		float principal = scn1.nextFloat();
	
		Scanner scn2 = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		float apr = scn2.nextFloat();
		float mpr = (apr/100) / 12;
		
		Scanner scn3 = new Scanner(System.in);
		System.out.print("Period (Years): ");
		int yprd = scn3.nextInt();
		int mprd = yprd * 12;
		
		float t = (float) (mpr * (float)Math.pow((1+mpr),mprd));
		float b = (float) (Math.pow((1+mpr),mprd)-1);
		float s = t/b;
		float morgage = principal * s;
		
		String result = NumberFormat.getCurrencyInstance().format(morgage);
		
		System.out.println("**** Test Case Notes ****");
		System.out.println("Your Principal is: " + principal);	
		System.out.println("Your MPR is: " + mpr);
		System.out.println("Your Monthly Period is: " + mprd);
		System.out.println("top: " + t);
		System.out.println("bottom: " + b);
		System.out.println("tbResult: "+ s);
		System.out.println("Mortgage: " + result );
		System.out.println(1+mpr);
		

/*		
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
