package unit_005_classes;

public class Dog
{
    // instance variables or fields
    // private due to encapsulation
    private String breed;
    private int weight;
    private String name;
    private String color;

    // constructor
    public Dog(String breed, int weight, String name, String color)
    {
        this.breed = breed;
        this.name = name;
        this.color = color;
        if (weight <= 0)
        {
            this.weight = Math.abs(weight);
        } else
        {
            this.weight = weight;
        }
    }

//    getters and setters
    public String getColor()// getter
    {
        return this.color;
    }

    public String getBreed()
    {
        return this.breed;
    }

    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weight;
    }

    // setters or mutators
    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        String message = "Dog breed: " + this.getBreed() + "\n" +
                        "Weight: " + this.getWeight() + "\n" +
                        "Color: " + this.getColor() + "\n" +
                        "Name: " + this.getName();
        return message;
    }
    
    
    
    
    

}//end of class
