package unit_009_inheritance;

public class Adog_client
{

    public static void main(String[] args)
    {
        Adog dog1 = new Adog("Labrador", 60, "Laica", "tan");
        System.out.println(dog1);
        Adog dog2 = new Adog();
        System.out.println(dog2);
    }

}
