package unit_006_Arrays.CBintermediateArray;

public class IntermediateArrays
{

	public static void main(String[] args)
	{
		int[] testArray = { 1, 2, 2, 1, 13 };
		test13(testArray);
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
			if(myArray[index] == 13)
			{
				if(index < myArray.length - 2)
				{
					total += 0;
					index += 2;
				}
				if(index < myArray.length - 1)
				{
					total += 0;
					return total;
				}
				total += 0;
				
			}
		}
		
		return total;
	}

}
