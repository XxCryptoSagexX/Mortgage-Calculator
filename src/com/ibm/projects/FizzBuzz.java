package com.ibm.projects;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Request Number
		 * If divisible by 5 = Print Fizz
		 * If divisible by 3 = Print Buzz
		 * If divisible by 5 OR 3 = Print FizzBuzz
		 * If NOT divisible by 5 OR 3 = Print Number
		 */
		
		Scanner scn1 = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scn1.nextInt();
		
		if  (number % 5 == 0 && number % 3 == 0) //<--- Code is repeating but is  clean OPTIONAL: Instead should have nested inside block for multiple of 3
		{
			// If number % 3 = 0
			//  print fizzbuzz
			// else
			//	print fizz
			System.out.println("FizzBuzz");
		}
		else if (number % 3 == 0)
		{
			System.out.println("Buzz");
		}
		else  if (number % 5 == 0) 
		{
			System.out.println("Fizz");
		}
		else
		{
			System.out.println(number);
		}
		System.out.println("**** Test ****");

		
		
		
	}

}
