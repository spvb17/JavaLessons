package inheritanceAndEncapsulation.homeworkTasks.first;

public class Vet
{
    public void treatAnimal(Animal animal)
    {
        System.out.println("Animal's food is "+animal.getFood());
        System.out.println("Animal's location is "+animal.getLocation());
    }
}
