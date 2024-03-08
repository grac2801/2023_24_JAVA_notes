package unit_009_inheritance.Polymorphism;


public class Polymorphism_client
{

    public static void main(String[] args)
    {
        Raccoon a1 = new Raccoon("Mr. G");
        System.out.println(a1.getColor());
        
        Animal a2 = new Raccoon("Mr. H");
        System.out.println(a2.getSound());
        
        
    }
}
