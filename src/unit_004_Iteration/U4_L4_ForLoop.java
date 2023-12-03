package unit_004_Iteration;

import java.util.Scanner;

public class U4_L4_ForLoop
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i < 11; i++)
		{
			System.out.println(i + ": Hello");
		}
		
		/*
		 * Student: write a for loop that outputs only even numbers
		 * from 1 -10
		 */
		for (int i = 1; i < 11; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Alternative way");
		//second alternative way
		for (int i = 2; i < 11; i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("\n\n***** printf and for loops *****");
		System.out.println("Solution A");
		int counter = 1;
		for (int i = 2; i <= 100; i+=2)
		{
			if(counter <= 5)
			{
				System.out.printf("%-5d", i);
				counter++;
			}
			
			if(counter > 5)
			{
				System.out.println();
				counter = 1;
			}
		}
		
		System.out.println("Solution B");
		for (int i = 2; i <= 100; i+=2)
		{
			if(i % 10 == 0)
			{
				System.out.printf("%-5d", i);
				System.out.println();
				i+=2;
				
				
				if(i > 100)
				{
					break;
				}
			}
			
			if(!(i % 10 == 0))
			{
				System.out.printf("%-5d", i);
			}
		}
		
		System.out.println("Solution C");
		for(int i = 2; i <= 100; i += 2)
		{
			System.out.printf("%-5d", i);
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
		
		
		System.out.println("\n\n***** Using for loop in strings *****");
		String word = "house";
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word.substring(i, i + 1));
		}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
