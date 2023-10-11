package unit_005_classes;

public class DogClient
{

    public static void main(String[] args)
    {
        Dog d = new Dog("Terrier", 14, "Spot", "Brown");
        System.out.println(d);
        System.out.println("\n\n");
        
        
        Dog e = new Dog("Collie", -10, "Randy", "Black");
        System.out.println(e);
    }

}
