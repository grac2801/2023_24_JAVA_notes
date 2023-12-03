package unit_004_Iteration.stringShortener;

import java.util.Scanner;

public class StringShortener
{
    public static void main(String[] args) {
        //Declare scanner
        Scanner scan = new Scanner(System.in);

        //Get message from user input
        System.out.println("Type the message to be shortened");
        String msg = scan.nextLine();
        msg = msg.toLowerCase();
        String alg1Msg = "";

        int repeats = 0;
        int vowels = 0;

        // Iterate through each letter in msg
        for(int i=0; i<msg.length(); i++)
        {
          String ltr = msg.substring(i, i+1);

          /* The compound statement returns true if ltr is not at the start,
           * is not preceded by a space, and is a vowel. Short circuit
           * evaluation prevents an error.
           */
          if(i != 0 && !msg.substring(i-1, i).equals(" ")
              &&(ltr.equals("a") || ltr.equals("e") || ltr.equals("i")
              || ltr.equals("o") || ltr.equals("u")))
          {
            vowels++;
          }

          // Increments repeats counter if the character is same as the previous
          else if(i > 0 && ltr.equals(msg.substring(i-1, i)))
          {
            repeats++;
          }

          // Adds character to shortened string if neither of the above are true
          else
          {
            alg1Msg += ltr;
          }
        }

        // Print shortened string and shortening results
        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed: " + vowels);
        System.out.println("Repeats removed: " + repeats);
        System.out.println("Algorithm 1 message: " + alg1Msg);
        System.out.println("Algorithm 1 characters saved: " + (msg.length() - alg1Msg.length()));

        String alg2Msg = "";
        int numLetters = 0;
        // Iterate through each letter in msg
        for(int i=0; i < msg.length(); i++){
          String ltr = msg.substring(i,i+1);

          // Only process if this character is not a space
          if(!ltr.equals(" ")){

            /* Check whether this character has already appeared by iterating
             * through characters from start up to the current letter and using
             * a boolean flag variable.
             */
            boolean alreadyUsed = false;
            for(int j=0; j<i; j++){
              if(msg.substring(j,j+1).equals(ltr)){
                alreadyUsed = true;
              }
            }

            /* If this character hasn't already appeared, iterate through the
             * rest of the characters and count how many times it appears.
             */
            if(!alreadyUsed){
              numLetters++;
              int count = 0;
              for(int j=i; j<msg.length(); j++){
                if(msg.substring(j,j+1).equals(ltr)){
                  count++;
                }
              }
              alg2Msg += count + ltr;
            }
          }
        }
        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + numLetters);
        System.out.println("Algorithm 2 message: " + alg2Msg);
        System.out.println("Algorithm 2 characters saved: " + (msg.length() - alg2Msg.length()));
        scan.close();
      }

}
