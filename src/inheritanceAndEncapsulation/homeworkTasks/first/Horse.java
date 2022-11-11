package inheritanceAndEncapsulation.homeworkTasks.first;

public class Horse extends Animal
{
    public Horse(){};
    public Horse(String food, String location)
    {
        super(food, location);
    }

    public void makeNoise()
    {
        System.out.println("Neigh-neigh");
    }

    public void eat()
    {
        System.out.println("Horse is eating");
    }
}
