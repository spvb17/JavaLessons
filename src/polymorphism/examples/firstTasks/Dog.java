package polymorphism.examples.firstTasks;

public class Dog extends Animal
{
    public String name;

    public Dog(){};
    public Dog(String name)
    {
        this.name = name;
    }
    public void eat()
    {
        System.out.println("Dog is eating");
    }

    public void voice()
    {
        System.out.println("Dog is making bark-bark");
    }

    public void voice(String someVoice)
    {
        System.out.println("Dog is making "+someVoice);
    }
}
