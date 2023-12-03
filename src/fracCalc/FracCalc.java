package fracCalc;

import java.util.*;

public class FracCalc
{
    // To simulate a given checkpoint, uncomment the corresponding pair
    // of main / produceAnswer calls below, and comment out the others
    
    public static void main(String[] args)
    {
        //mainCP1(args);
        
        // Use this for CP2, CP3, and Final
        mainFinal(args);
    }
        
    public static String produceAnswer(String inputLine)
    {
        
        return produceAnswerFinal(inputLine);
    }
    
    

    

    
  
    
    public static void mainFinal(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        String inputLine = inputScanner.nextLine();
        while (!inputLine.equals("quit"))
        {
            System.out.println(produceAnswer(inputLine));
            inputLine = inputScanner.nextLine();
        }
        inputScanner.close();
    }
 
    
    public static String produceAnswerFinal(String inputLine)
    {
        int totalNum = 0;
        int totalDen = 1;
        String lastOperator = "+";
        
        @SuppressWarnings("resource")
        Scanner lineScanner = new Scanner(inputLine);
        while (lineScanner.hasNext())
        {
            // Next token should be an operand
            String operand = lineScanner.next();
            if (parseValue(operand, 0) == 0)
            {
                // This means that the operand is mis-formatted, and an error has been
                // printed already.  Bail.
                return "";
            }
            
            int operandNum = parseValue(operand, 1);
            int operandDen = parseValue(operand, 2);
            int operandWhole = parseValue(operand, 3);
            //System.out.println("after parseValue:" + operandNum + ", " + operandDen);

            // Convert to improper fraction
            boolean isNegative = (operandWhole < 0);
            operandNum += (Math.abs(operandWhole) * operandDen);
            if (isNegative)
                operandNum *= -1;
            
            // Combine operand we just read with prior total and operator
            
            // - and / are just special cases of + and *, so convert as necessary
            if (lastOperator.equals("-"))
            {
                operandNum = -1 * operandNum;
                lastOperator = "+";
            }
            else if (lastOperator.equals("/"))
            {
                if (operandNum == 0)
                {
                    return "ERROR: Divide by zero";
                }
                int temp = operandNum;
                operandNum = operandDen;
                operandDen = temp;
                
                if (operandDen < 0)
                {
                    operandDen *= -1;
                    operandNum *= -1;
                }
                
                lastOperator = "*";
            }
            
            
            // Now operations are broken down to + or *.  Do them.
            if (lastOperator.equals("+"))
            {
                int newTotalNum = (totalNum * operandDen) + (operandNum * totalDen);
                int newTotalDen = operandDen * totalDen;
                totalNum = newTotalNum;
                totalDen = newTotalDen;
                //System.out.println("sum: " + totalNum + ", " + totalDen);
            }
            else if (lastOperator.equals("*"))
            {
                totalNum *= operandNum;
                totalDen *= operandDen;
            }
            
            if (totalDen == 0)
            {
                return "ERROR: Divide by zero";
            }
            
            // Reduced improper fraction
            int gcd = getGcd(totalNum, totalDen);
            totalNum /= gcd;
            totalDen /= gcd;
            
            // Get next operator
            if (lineScanner.hasNext())
            {
                lastOperator = lineScanner.next();
                if (!lastOperator.equals("+") &&
                    !lastOperator.equals("-") &&
                    !lastOperator.equals("*") &&
                    !lastOperator.equals("/"))
                {
                    return "ERROR: Expected operator, found '" + lastOperator + "'";
                }
            }
            
        }
        
        // improper -> mixed fraction
        boolean isNegative = (totalNum < 0);
        int whole = Math.abs(totalNum) / totalDen;
        totalNum = Math.abs(totalNum) % totalDen;
        
        // Put the negative sign where it belongs
        if (isNegative)
        {
            if (whole == 0)
                totalNum *= -1;
            else
                whole *= -1;
                
        }
        //System.out.println("improper -> mixed fraction: " + whole + ", " + totalNum);
        
        // Construct answer!
        String answer = "";
        
        // Whole number portion
        if (whole == 0)
        {
            if (totalNum == 0)
            {
                return "0";
            }
        }
        else
        {
            // Whole is nonzero.  Print it, and maybe an underscore
            answer += whole;
            if (totalNum == 0)
            {
                // No fractional part, so we're done
                return answer;
            }
            else
            {
                // There is a fractional part, so print the _
                answer += "_";
            }
        }
        
        
        
        // If we're still here, there's a fractional portion
        answer += totalNum + "/" + totalDen;
        return answer;
    }
    
    // Returns the portion of the fraction requested, optionally
    // converting to an improper fraction first.
    static public int parseValue(String value, int what)
    {
        // what == 0, means don't return any value, just try to parse it all,
        //            and print any errors.  Return 1 if it worked, 0 otherwise
        // what == 1, return numerator
        // what == 2, return denominator
        // what == 3, return whole number part
        int whole = 0;
        int num = 0;
        int den = 1;
        
        int iUnderscore = value.indexOf("_");
        int iWholeEnd = iUnderscore;
        int iNum = iUnderscore + 1;
        int iSlash = value.indexOf("/");
        
        if (iUnderscore == -1)
        {
            if (iSlash == -1)
            {
                // No underscore or slash?  It's all one integer
                iWholeEnd = value.length();
            }
            else
            {
                // No underscore, yes slash.  It's all a fraction
                iWholeEnd = 0;
            }
        }
        else
        {
            if (iSlash == -1)
            {
                // Yes underscore, no slash.  Bogus
                System.out.println("ERROR: Invalid format.  Found underscore, but no slash: '" + value + "'");
                return 0;
            }
            
            // Yes underscore, yes slash
            iWholeEnd = iUnderscore;
        }
        
        // If there's a whole number, read it
        if (iWholeEnd != 0)
        {
            String wholeString = value.substring(0, iWholeEnd);
            if (!isInteger(wholeString))
            {
                // Should only fail when called with what == 0
                System.out.println("ERROR: Expected integer, found '" + wholeString + "' inside '" + value + "'");
                return 0;
            }
            whole = Integer.parseInt(wholeString);
        }
        
        // Get the fraction, if any
        if (iSlash == -1)
        {
            // No fraction, so the whole number is it
            if (what == 0)
                return 1;
            
            // numerator is 0
            if (what == 1)
                return 0;
            
            // Return denominator of 1 for integers
            if (what == 2)
                return 1;

            return whole;
        }
        
        // Parse numerator
        String numString = value.substring(iNum, iSlash);
        if (!isInteger(numString))
        {
            // Should only fail when called with what == 0
            System.out.println("ERROR: Expected integer, found '" + numString + "' inside '" + value + "'");
            return 0;
        }
        num = Integer.parseInt(numString);

        // Parse denominator
        // TODO: What if string ends on slash?  Does this crash?
        String denString = value.substring(iSlash + 1);
        if (!isInteger(denString))
        {
            // Should only fail when called with what == 0
            System.out.println("ERROR: Expected integer, found '" + denString + "' inside '" + value + "'");
            return 0;
        }
        den = Integer.parseInt(denString);
        
        // Done parsing, so if caller only cares about errors, return now
        if (what == 0)
            return 1;
        
        // Take care of negative denominator
        if (den < 0)
        {
            den *= -1;
            num *= -1;
        }
        
        if (what == 1)
            return num;
        
        if (what == 2)
            return den;
        
        return whole;
    }
    
    static public boolean isInteger(String s)
    {
        int i = 0;
        if (s.charAt(0) == '-')
            i = 1;
        
        for (; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ((c < '0') || (c > '9'))
                return false;
        }
        
        return true;
    }
    
    static public int getGcd(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        for (int g = a; g >= 2; g--)
        {
            if (((a % g) == 0) &&
                ((b % g) == 0))
            {
                return g;
            }
        }
        
        return 1;
    }

}

