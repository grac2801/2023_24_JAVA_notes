package unit_006_Arrays;
import edhesive.shapes.*;
import java.util.Arrays;

public class U6_L1_IntroToArrays
{

	public static void main(String[] args)
	{
		//They have an index starting at 0
		int[] numbers = {10, 15, -5, 4, 1};
		
		
		//They can be treated as regular numbers
		numbers[0] = 89;
		numbers[0]++;
		numbers[2] = numbers[2] + 4;
		System.out.println(numbers[2]);
		
		double[] doubleArray = new double[3];
		doubleArray[0] =  10.6;
		doubleArray[1] =  20.5;
		doubleArray[2] =  11;
		System.out.println(doubleArray);
		
		double answer = doubleArray[0] + doubleArray[1];
		System.out.println(answer);
		
		//Default values for arrays
		int[] defaultInt = new int[3];
		System.out.println(defaultInt[1]);
		
		double[] defaultDou = new double[3];
		System.out.println(defaultDou[1]);
		
		//Add objects to an array
		Circle[] myCircles = new Circle[2];
		System.out.println(myCircles[0]);
		
		myCircles[0] = new Circle(5.8);
		myCircles[1] = new Circle();
		
		System.out.println(myCircles[0]);
		System.out.println(myCircles[1]);
		
//		int moreNums[] = new int[2];
		
		char[] myChars = new char[2];
		myChars[0] = 'a';
		System.out.println(myChars[0]);
		System.out.println(myChars[1]);
		
		
		char[] word = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(word);
		
		
		String[] words = {"dog", "cat", "bird"};
		System.out.println(words);
		System.out.println(Arrays.toString(words));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
