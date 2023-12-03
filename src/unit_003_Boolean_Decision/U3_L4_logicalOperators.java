package unit_003_Boolean_Decision;

import java.util.Scanner;

public class U3_L4_logicalOperators
{

	public static void main(String[] args)
	{
		//relational (>, <, >=, <=, ==, != --> True or false
		//Logical (and = &&, or == ||, not = !)
		
		int x = 4;
		int y = 9;
		
		//and operator [relational have higher precedence than 
		//logical
		boolean first = (x < 10) && (y > 5);
		System.out.println("first: " + first);
		
		//or operator
		boolean second = (x < 10) || (y > 10);
		System.out.println("second: " + second);
		
		//not operator
		x = 5;
		boolean third = !(x == 5);
		boolean third_alternative = (x != 5);
		System.out.println("third: " + third);
		System.out.println("third_alternative: " + third_alternative);
		
		//from video in projectStem
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		if(num >= 0 && num <= 100)
		{
			System.out.println("Number between 0 and 100");
		}
		if(num < 0 || num > 100)
		{
			System.out.println("Number is not valid.");
		}
		if(!(num == 75))
		{
			System.out.println("number is not 75");
		}
		
		/*
		 * Ask user to input a value between 25 inclusive and 
		 * 75 not inclusive. 
		 * Print 2 solutions to it which state that the number
		 * is not between 25 and 75
		 */
		System.out.println("input a number between 25 inclusive and 75 not inclusive");
		int luke = scan.nextInt();
		if(luke >= 25 && luke < 75)
		{
			System.out.println("valid numberwahoo!");
		}
		

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
