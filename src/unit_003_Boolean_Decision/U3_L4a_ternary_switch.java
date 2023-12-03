package unit_003_Boolean_Decision;

import java.util.Random;
import java.util.Scanner;

public class U3_L4a_ternary_switch
{

	public static void main(String[] args)
	{
		//Provide a random number between 1 - 10
		Random rand = new Random();
		int randValue = rand.nextInt(11) + 1;
		System.out.println("Random value: " + randValue);
		
		//Ask user for input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your guess: ");
		int myGuess = scan.nextInt();
		
		//ternary operator
		boolean same2 = myGuess == randValue? true: false;
		System.out.println("Correct guess? " + same2);
		
		String same3 = myGuess == randValue? "You guessed it right": "Failed!!";
		System.out.println("Correct guess? " + same3);
		
		
		
		//switch
//		String planet = "Earth";
		System.out.println("Enter a planet in the solar system.");
		scan.nextLine();
		String planetGuess = scan.nextLine();
		
		switch(planetGuess)
		{
		case "Mars":
			System.out.println("You are wrong");
			break;
		case "Earth":
			System.out.println("You are correct.");
			break;
		case "Mercury":
			System.out.println("You are wrong.");
			break;
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
