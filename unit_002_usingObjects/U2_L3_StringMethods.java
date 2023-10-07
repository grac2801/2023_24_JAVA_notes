package unit_002_usingObjects;

public class U2_L3_StringMethods
{

	public static void main(String[] args)
	{
		System.out.println("\n\n***** Length of a string *****");
		String word = "apple";
		System.out.println("The length of word is: " + word.length());
		
		System.out.println("\n\n***** Equality of strings *****");
		String name1 = "John";
		String name2 = new String("John");
//		String name2 = "John";
		System.out.println("name1 equal to name2? " + (name1 == name2));
		//We only use == for numbers
		System.out.println("Equality checking for strings: " + name1.equals(name2));
		
		System.out.println("\n\n***** substrings *****");
		String wildAnimal = "Rhinocerous";
		/*
		 * Overloaded methods = same name but different signatures
		 * Signature includes parameters, types, or length of parameters
		 */
		System.out.println("substring 1 thru 4: " + wildAnimal.substring(1, 4));
		System.out.println("substring from 4 on: " + wildAnimal.substring(4));
		
		System.out.println("\n\n***** upper and lowercase *****");
		String upper = "scream";
		String lower = "WHISPER";
		
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println("scream should say: " + upper.toUpperCase());
		System.out.println("whisper should say: " + lower.toLowerCase());
		
		System.out.println(lower);//Does not keep the change unless reassigned
		
		System.out.println("\n\n***** compareTo() *****");
		String herbivore = "antelope";
		String pet = "dog";
		System.out.println("Compare antilope to dog: " + herbivore.compareTo(pet));
		System.out.println("Compare dog to antilope: " + pet.compareTo(herbivore));
		System.out.println("Compare dog to dog: " + pet.compareTo(pet));
		
		
		
		System.out.println("\n\n***** indexOf() *****");
		String striped = new String("photosynthesis");
		int a = striped.indexOf("s");
		int b = striped.indexOf("x");
		System.out.println(a);
		System.out.println(b);
		
		
		String sentence = new String("Today is a good day to learn JAVA");
		int c = sentence.indexOf("JA ");
		System.out.println("JA" + " was found at index " + c);
		
		
		
		
		
		
		
		
		
	}

}
