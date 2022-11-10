package inheritanceAndEncapsulation.examples.firstTask;

import inheritanceAndEncapsulation.examples.firstTask.Animal;
import inheritanceAndEncapsulation.examples.firstTask.Dog;

public class Main
{
    public static void main(String[] args) {
        Animal animal = new Animal("Some animal", 0);
        animal.eat();
        animal.sleep();
        System.out.println(animal.getName());
        System.out.println(animal.getAge());


        Dog dog = new Dog("Belka", 4, "bark-bark");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getSound());

    }
}
