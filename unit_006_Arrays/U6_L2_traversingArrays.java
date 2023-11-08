package unit_006_Arrays;

import java.util.Scanner;

public class U6_L2_traversingArrays
{

	public static void main(String[] args)
	{
//		System.out.println("Printing the values of an array using the for loop");
//		int[] myInts = {4, 6, 23, 41, 82, 23, 10};
//		for(int i = 0; i < myInts.length; i++)
//		{
//			System.out.printf("%-5d", myInts[i]);
//		}
//		
//		System.out.println("\n\n++++++++++ Traverse and look for a value input by user ++++++++++");
		Scanner scan = new Scanner(System.in);
//		double[] list = {1.5, 6.2, 8.3, -4.1, 0.8, -2.8};
//		
//		//Ask question to user
//		System.out.println("What value are you looking for? ");
//		double look = scan.nextDouble();
//		
//		boolean found = false;
//		
//		for(int i = 0; i < list.length; i++)
//		{
//			if(list[i] == look)
//			{
//				found = true;
//				System.out.println("Found at index: " + i);
//				break;
//			}
//			else
//			{
//				found = false;
//			}
//		}
//		if(found == false)
//		{
//			System.out.println("Value not found.");
//		}
//		
//		
//		System.out.println("++++++++++ Count how many times an item is found ++++++++++");
//		int[] values = {1, 2, 3, 2, 4, 6, 3, 2, 5, 8};
//		System.out.println("What value are you looking for? ");
//		int number = scan.nextInt();
//		
//		
//		int counter = 0;
//		for (int i = 0; i < values.length; i++)
//		{
//			if(values[i] == number)
//			{
//				counter++;
//			}
//		}
//		System.out.println(number + " was found " + counter + " time(s).");
		
		
		System.out.println("++++++++++ Student activity ++++++++++");
		// Check whether even or odd and add value to new array replacing integers with 
		// "odd" or "even"
		int[] nums = {11, 32, 23, 44, 51, 65, 76, 80, 99};
		
		String[] result = new String[nums.length];
		
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
				result[i] = "even";
			}
			else
			{
				result[i] = "odd";
			}
		}
		
		
		for (int i = 0; i < result.length; i++)
		{
			System.out.printf("%-3d=  %-6s%n", i + 1, result[i]);
		}
	
		scan.close();
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}
