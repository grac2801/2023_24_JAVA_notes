package unit_002_usingObjects;

public class U2_L7_WrapperClasses
{

	public static void main(String[] args)
	{
		Integer thirtySixInt = Integer.valueOf(36);
		Integer thirtySixStr = Integer.valueOf("36");
		int total = thirtySixInt + thirtySixStr;
		System.out.println(total);
		
		
		System.out.println("\n\n***** The max value for integers *****");
		System.out.printf("The max value is: %,d%n", Integer.MAX_VALUE);
		System.out.printf("The min value is: %,d%n", Integer.MIN_VALUE);
		
		System.out.println("\n\n***** A string into an integer *****");
		String num1 = "700";
		String num2 = "250";
		System.out.println(num1 + num2);
		
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		System.out.println(first + second);
		
		System.out.println("\n\n***** other functions *****");
		String seventeen = "10001";
		int seventeen_int = Integer.parseInt(seventeen, 2);
		System.out.println("Seventeen: " + seventeen_int);
		
		int decimalValue = Integer.parseInt("A1", 16);
		System.out.println("decimalValue: " + decimalValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
