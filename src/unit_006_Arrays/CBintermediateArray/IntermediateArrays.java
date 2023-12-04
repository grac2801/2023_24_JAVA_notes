package unit_006_Arrays.CBintermediateArray;

public class IntermediateArrays
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		int[] testArray = { 13, 1, 2, 13, 2, 1, 13};
		int total = test13(testArray);
		System.out.println(total);
		
	}

	private static int test13(int[] myArray)
	{
		int index = 0;
		int total = 0;
		
		while(index < myArray.length)
		{
			if(myArray[index] != 13)
			{
				total += myArray[index];
				index += 1;
			}
			else if(myArray[index] == 13)
			{
				if(index == myArray.length - 2)
				{
					total += 0;
					return total;
				}
				if(index == myArray.length - 1)
				{
					total += 0;
					return total;
				}
				total += 0;
				index += 2;
				
			}//End of while
		}//End of method
		
		return total;
	}

}
