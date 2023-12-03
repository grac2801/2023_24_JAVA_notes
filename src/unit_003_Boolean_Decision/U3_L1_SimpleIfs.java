package unit_003_Boolean_Decision;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U3_L1_SimpleIfs
{

	public static void main(String[] args)
	{
//		int x = 5;
//		if (x == 5)
//		{
//			System.out.println("x equals 5");
//		}
		
		
		Scanner input = new Scanner(System.in);
//		System.out.println("How many legs does your pet have? ");
//		int legs = input.nextInt();
//		if(legs == 4)
//		{
//			System.out.println("It is a dog!");
//			System.out.println("It is a cat!");
//			System.out.println("It is a rat!");
//		}
//		
//		//change the flow of execution
//		
//		System.out.println("Enter a double value: ");
//		double num = input.nextDouble();
//		if(num == 18.25)
//		{
//			System.out.println("you got it.");
//		}
//		
//		System.out.println("1");
//		
//		if(num == 3)
//		{
//			System.out.println("2");
//		}
//		System.out.println("3");
		
		int rand = ThreadLocalRandom.current().nextInt(10) + 1;
		System.out.println("rand = " + rand);
		//my guess
		System.out.println("Guess the number: ");
		int myGuess = input.nextInt();
		
		//test
		if(rand == myGuess)
		{
			System.out.println("You guessed the # correctly.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
