package unit_009_inheritance.Polymorphism;


public class Animal
{

    private String color;
    private int age;
    private String sound;
    
//    public Animal()
//    {
//        this("Black and white", 5, "rrrrh");
//    }

    public Animal(String color, int age, String sound)
    {
        super();
        this.color = color;
        this.age = age;
        this.sound = sound;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * @return the sound
     */
    public String getSound()
    {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound)
    {
        this.sound = sound;
    }
}
