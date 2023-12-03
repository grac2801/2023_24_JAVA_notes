package unit_004_Iteration;

public class U4_L5_NestedLoops 
{
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("\nNext i " + i);
			for(int j = 1; j <= 5; j++)
			{
				System.out.println("Hi there\t");
			}
		}
		
		
		System.out.println();
		
		String word = "Java";
		for(int i  = 0; i < 3; i++)
		{
			for(int j = 0; j < word.length(); j++)
			{
				System.out.println(word.substring(j, j + 1));
			}
			System.out.println();
			
		}
		
		/*
		 * Create nested loop that will take a word and output each letter 3 times each
		 * in a row.
		 * "java" =  jjj
              aaa
              vvv
              aaa
		 */
		String myWord = "java";
		for(int i = 0; i < myWord.length(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(myWord.substring(i, i + 1));
			}
			System.out.println();
		}
		
		
		
		System.out.println("Mixing i and j");
		//456, then 3.4,5,6 thru 1,2,3,4,5,6
		for(int i = 4; i > 0; i--)
		{
			for(int j = i; j < 7; j++)
			{
				System.out.println(j);
			}
			System.out.println();
		}
	}
    
}
