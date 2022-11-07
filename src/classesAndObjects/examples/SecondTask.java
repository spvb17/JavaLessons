package classesAndObjects.examples;

public class SecondTask
{
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2005, 3.4, 50);
        Car car2 = new Car("BMW", 2001, 4.4, 60);
        Car car3 = new Car("Toyota", 2003, 2.0, 40);
        Car car4 = new Car("Kia", 2009, 1.6, 55);
        Car[] arr = {car1, car2, car3, car4};
        oldestCar(arr);
    }

    public static void oldestCar(Car[] arr)
    {
        Car car = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].year<car.year)
            {
                car = arr[i];
            }
        }
        System.out.println("The oldest car is " + car.name);
    }
}

class Car
{
    public String name;
    public int year;
    public double engineVolume;
    public int speed;

    public Car(){};
    public Car(String name, int year, double engineVolume, int speed)
    {
        this.name = name;
        this.year = year;
        this.engineVolume = engineVolume;
        this.speed = speed;
    }

    public void acceleration()
    {
        speed+=10;
    }

    public void brake()
    {
        speed-=15;
    }
}
