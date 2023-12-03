package unit_002_usingObjects;

public class U2_L1_stringsAndClassTypes
{
	public static void main(String[] args)
	{
		/*
		 * primitive data types [pass by value]
		 */
		System.out.println("--Store by value --");
		int num1 = 5;
		System.out.println("num1: " + num1);
		int num2 = num1;
		System.out.println("num2: " + num2);
		
		//Change num1 to 10
		num1 = 10;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		
		System.out.println("\n\nPass by reference");
		String city1 = "San Diego";
		String city2 = city1;
		System.out.println("city1 = " + city1 + ", memory: " + city1.hashCode());
		System.out.println("city2 = " + city2 + ", memory: " + city2.hashCode());
		System.out.println("\n\n");
		//change city1 to LA
		city1 = "Los Angeles";
		System.out.println("city1 = " + city1 + ", memory: " + city1.hashCode());
		System.out.println("city2 = " + city2 + ", memory: " + city2.hashCode());
		System.out.println("\n\n");
		//strings not instantiated are given the null value
		String color = null;
		System.out.println(color);
		
		
		
		
		
		
		
		
		
		
	}
}
