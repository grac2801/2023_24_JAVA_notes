package unit_009_inheritance.Polymorphism;

import java.util.ArrayList;

public class Polymorphism_client
{

    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        System.out.println(myAnimal);
        
        
        System.out.println();
        Parrot parrot = new Parrot("Mr. G");
        System.out.println("The owner is: " + parrot.getOwner());
        System.out.println(parrot);
        
        
        System.out.println();
        Animal myMix = new Parrot("Mr. H");
        System.out.println("This animal is " + parrot.getColor());
        System.out.println(myMix);
        System.out.println(myMix.getAge());
        
        //Arrange in ArrayList
        System.out.println();
        ArrayList<Animal> listOfAnimals = new ArrayList<Animal>();
        listOfAnimals.add(myAnimal);
        listOfAnimals.add(parrot);
        listOfAnimals.add(myMix);
        System.out.println(listOfAnimals);
        
        System.out.println();
        takeAnimals(myAnimal);
        takeAnimals(myMix);
        takeAnimals(parrot);
        
    }
    
    public static void takeAnimals(Animal animal)
    {
        System.out.println(animal);
    }
}
