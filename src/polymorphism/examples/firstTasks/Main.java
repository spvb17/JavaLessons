package polymorphism.examples.firstTasks;

public class Main
{
    public static void main(String[] args) {
      Dog dog = new Dog();
      Cat cat = new Cat();
      Animal animal = new Animal();

      doSomething(cat);
      doSomething(dog);
      doSomething(animal);

    }

    public static void doSomething(Object object)
    {
        System.out.println(object.hashCode());
    }
}
