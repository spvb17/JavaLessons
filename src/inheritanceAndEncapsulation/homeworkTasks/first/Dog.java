package inheritanceAndEncapsulation.homeworkTasks.first;

public class Dog extends Animal
{
    public Dog(){};
    public Dog(String food, String location)
    {
        super(food, location);
    }
    public void makeNoise()
    {
        System.out.println("Bark-bark");
    }

    public void eat()
    {
        System.out.println("Dog is eating");
    }
}
