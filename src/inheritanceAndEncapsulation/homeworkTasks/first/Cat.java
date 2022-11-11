package inheritanceAndEncapsulation.homeworkTasks.first;

public class Cat extends Animal
{
    public Cat(){};
    public Cat(String food, String location)
    {
        super(food, location);
    }
    public void makeNoise()
    {
        System.out.println("Meow-meow");
    }

    public void eat()
    {
        System.out.println("Cat is eating");
    }
}
