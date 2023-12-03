package unit_004_Iteration;

public class U4_L6_AlgorithmEfficiency
{

    public static void main(String[] args)
    {
        // Longer iterations. Each letters check on other letters
        String word = "dictionary";
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {

            for (int j = 0; j < word.length(); j++)
            {
                count++;

                if (i != j && word.substring(i, i + 1).equals(word.substring(j, j + 1)))
                {
                    System.out.println(word.substring(i, i + 1) + " is a duplicate");

                }

            }

        }

        System.out.println("There are " + count + " iterations");
        
        /*
         * Second example. More efficient and fewer iterations.
         */
        System.out.println("\n\n********** Second more efficient example **********");
        int totalCount = 0;

        for (int i = 0; i < word.length(); i++)
        {

            for (int j = i + 1; j < word.length(); j++)
            {

                totalCount++;

                if (word.substring(i, i + 1).equals(word.substring(j, j + 1)))
                {
                    System.out.println(word.substring(i, i + 1) + " is a found duplicate");

                }

            }

        }

        System.out.println("There are " + totalCount + " iterations.");

    }// End of main

}
