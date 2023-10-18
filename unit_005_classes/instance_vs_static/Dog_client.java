package unit_005_classes.instance_vs_static;

public class Dog_client
{

    public static void main(String[] args)
    {
        Dog d1 = new Dog("Collie", 75, "Skippy", "brown");
        System.out.println(d1);
        Dog d2 = new Dog("Shepherd", 125, "Laica", "spotted");
        System.out.println(d2);
    }

}
