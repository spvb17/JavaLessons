package inheritanceAndEncapsulation.homeworkTasks.first;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("Whiskas", "Central asia");
        Dog dog = new Dog("Meat", "Europe");
        Horse horse = new Horse("Vegetables", "Asia");
        Vet vet = new Vet();
        vet.treatAnimal(cat);
        vet.treatAnimal(dog);
        vet.treatAnimal(horse);
        Animal[] arr = {dog, cat, horse};
    }
}
