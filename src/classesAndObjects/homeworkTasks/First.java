package classesAndObjects.homeworkTasks;

public class First
{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Arlan", "alabay", 3);
        Dog dog2 = new Dog("Aktos", "cur", 4);
        Dog dog3 = new Dog("Beethoven", "saint bernard", 2);
        Dog dog4 = new Dog("Mukhtar", "german shepherd", 5);
        Dog dog5 = new Dog("Maylo", "jack russel terrier", 1);
        dog1.voice();
        dog5.voice();

        Dog[] arr = {dog1, dog2, dog3, dog4, dog5};
        dogAge(arr);
        System.out.println(dog1);
    }

    public static void dogAge(Dog[] arr)
    {
        Dog dog = arr[0];
        Dog dog1 = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].age>dog.age)
            {
                dog = arr[i];
            }
            if(arr[i].age<dog1.age)
            {
                dog1 = arr[i];
            }
        }
        System.out.println("The oldest dog is " + dog.name + ". His age is " + dog.age);
        System.out.println("The youngest dog is " + dog1.name + ". His age is " + dog1.age);
    }
}

class Dog
{
    public String name;
    public String breed;
    public int age;

    public Dog(){};
    public Dog(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void voice()
    {
        System.out.println("bark-bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
