package temp;

public class DogRunner
{

    public static void main(String[] args)
    {
        Dog d = new Dog("Terrier", 14, "Spot", "Brown");
        Dog e = new Dog("Collie", -10, "Spock", "Black");
        System.out.println(
                "Breed: " + d.getBreed() + "\n" + 
        "Weight: " + d.getWeight() + "\n" 
        + "Name: " + d.getName());
        
        System.out.println();
        System.out.println(d);
        
        System.out.println();
        System.out.println(e);
        
        
        System.out.println("\n\n");
         if(d.equals(e))
         {
         System.out.println("Both dogs are the same,");
         }
         else
         {
         System.out.println(d.getName() + " and " +
         e.getName() + " are different");
        
         }

    }

}
