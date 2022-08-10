package com.ibm.exercise1;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
/*
		int[] numbers = {2,3,5,1,4};
		System.out.println("Presorted Array List: " + Arrays.toString(numbers));
		Arrays.sort(numbers); // <----- Sorts the array 
		System.out.println("*********************");
		System.out.println("Sorted Array List: " + Arrays.toString(numbers));
		
		System.out.println("********* Test 2 *********");
		
---		
		String[] names = {"Jimmy", "James", "Thomas", "Alexander", "Charles"};
		System.out.println("Presorted Array - List of Names: " + Arrays.toString(names));
		Arrays.sort(names); // <---- Sorted the Array that seems to be alphabetical. 
		
		System.out.println("Sorted  Array - List of Names: " + Arrays.toString(names));
---
		int[][] numbers = new int[2][3]; //<--- Two Dimensional  Equates to 2Rows 3Colums
		numbers[0][0] = 1;
		
		System.out.println(Arrays.deepToString(numbers) );
---	
		int[][][] numbers = new int[2][3][5]; //<--- Two Dimensional  Equates to 2Rows 3Colums
		numbers[0][0][0]= 1;

		System.out.println(Arrays.deepToString(numbers) ); //<---- Must use .deepToString() to call the multi array
---		
		int [][] numbers = {{1,2,3}, {4,5,6} };
		System.out.println(Arrays.deepToString(numbers) );
---		
		final float PI = 3.14F; //<--- Constants tend to to have CAPITAL variable names.
	
---		
		double result = (double)10 / (double)3;
		System.out.println(result);
---
		int x = 1;
		int y = x++; //<---- this is a post increment. Basically copy x and increment to new value for x. thus is why it stays as 1
		int z = ++x;  //<---- this is a pre increment. Basically copy x and increment for value of x and y
		// You can only do PRE or POST incrementation. 
		
		System.out.println(x);
		System.out.println(y);
---
		int x = 1;
		x += 2; //<---- This is another way of saying +2 without typing it manually. You can also use the other operations in this format. 
		System.out.println(x);
---
		int x = 10 + 3 * 2;
		int y = 21^3; //<----Not sure what this operation is. Oracle says " ^       Bitwise exclusive OR "
		System.out.println(x);
		System.out.println(y);
		System.out.println(Math.pow(3,3));
---			
		// Implicit casting. In this case X was converted into an int before logic proceeded.  
		// No chance for data los

		short w = 1;
		int  x = w +2;
		System.out.println( "Implicit Casting From Short: " +  x);
		System.out.println("*********************");
		// byte(1) > short(2) > int(4) > long(8) > float(4) > double(8)
		
		// transforms 2 into a double or 2.0 to continue the logic. 
		double y = 1;
		double  z = y + 2;
		System.out.println("Implicit Casting to Double: " + z);
		System.out.println("*********************");
		// Explicit Casting. I am choosing to make A an int to continue the logic.
		double a = 1.1;
		int  b = (int)a + 2;
		System.out.println("Explicit Casting: " + b);
		System.out.println("*********************");
		
		String c = "1";
		// Integer.parseInt(c); // <- converting function that converts c(string) to c(int)
		// int d = (int) c + 2; //<---- this logic is wrong due to you ont being able to convert string to int. You need to use the Integer.parseInt() function
		int d = Integer.parseInt(c) + 2;
		System.out.println(d);
		System.out.println("*********************");
		
		// You will need to use the appropriate cast type as you cannot pick any casting. 
		String e = "1.1";
		double  f = Double.parseDouble(e) + 2;
		System.out.println(f);
		
		// Round = rounds number to the clusest
		// ceil = populates the highest/closest int to the given number. 
		// floor = opposite of ceil
		// max = returns the larger number of the arguments 
		// min = opposite of max 
		// random = random number between 0 and 1
		// random() * 100 = Random number between 1 and 100
		int result =  (int) Math.round(Math.random() * 100); // This allows for a random number with no decimal or leading zeros. 
		System.out.println(result);
		
		System.out.println("*********************");
		System.out.println("****Number Randomization Test ****");
		 
		int counter = 1;
		for (int i = 0; i < 4; i++)
		{
			int testRandomizedNumber =  (int) Math.round(Math.random() * 100); // This allows for a random number with no decimal or leading zeros. 
			//System.out.println("I is: " + i);
			System.out.println("Random Number "+ counter + " : " + testRandomizedNumber);
			counter++;
		}
---				
		// Used to format numbers as Currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat currency2 = NumberFormat.getCurrencyInstance();
		String result = currency.format(1234567.891); 
		String result2 = currency2.format(155000000.998); //<---- Rounds up to the nearest dollar. 
		System.out.println("The total price is " + result + " .");
		System.out.println("Your checking account ending in 4478 is: " + result2);
		
		System.out.println("*********************");
		
		// Used to format numbers as a Percentage. 
		NumberFormat percent = NumberFormat.getPercentInstance(); 
		String result3 = percent.format(0.1);
		System.out.println("Your chance of survival is at least " + result3 +  ".");
		
		
		System.out.println("**** Simplified Version ****");
		//Simplified version
		String result4 = NumberFormat.getPercentInstance().format(0.9); //<--- this is chaining the function instead of making them separate
		System.out.println("Your chance of survival is at least " + result4 + ".");
---		

		System.out.println("**** Age ****");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: "); //<---- ".println automatically goes to the next line which makes this look weird so we used "print" instead
		byte age = scanner.nextByte();
		System.out.println("You are " + age );
		
		System.out.println("**** Name: .next ****");
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Name: "); 
		String name = scanner2.next(); //<---- Note that this will not allow for "Tre Williams" due to only allowing ONE token TW is two tokens.
		System.out.println("You are " + name );
		
		System.out.println("**** Full Name: .nextLine ****");
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Full Name: "); 
		String fullName = scanner3.nextLine(); //.trim();	<---- Can be used to ensure there are no leading spaces.
		System.out.println("You are " + fullName );
*/	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
