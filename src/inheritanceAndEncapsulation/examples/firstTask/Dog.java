package inheritanceAndEncapsulation.examples.firstTask;

import inheritanceAndEncapsulation.examples.firstTask.Animal;

public class Dog extends Animal
{
    private String sound;

    public Dog(){};

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Dog(String name, int age, String sound)
    {
        super(name, age);
        this.sound = sound;
    }
}
