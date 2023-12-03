package unit_001;

import java.util.Scanner;

public class U1_L5_Modulus
{

	public static void main(String[] args)
	{
		/*
		 * modulus is used for patterns
		 * time calculations
		 * money
		 * online encryption
		 * even or odd
		 */
		
		System.out.println(14 % 5);
		int mod = 14;
		mod %= 5;
		System.out.println(mod);
		
		//modulus only works with integers.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter another whole number: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "/" + num2 + " = " + num1/num2);
		System.out.println(num1 + "%" + num2 + " = " + num1%num2);
		
		//odd or even
		System.out.println("\n\nChecking for even or odd");
		System.out.println("0 means even, 1 means odd");
		System.out.println(5%2 + " means odd(1)");
		System.out.println(4%2 + " means even(0)");
		
		//select last digit in a number
		int digit = 768_453;
		//Extract only the last number
		System.out.println("the last number is: " + digit % 10);
		System.out.println("the last 2 numbers are: " + digit % 100);
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
