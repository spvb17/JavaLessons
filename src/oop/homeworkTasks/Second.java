package oop.homeworkTasks;

public class Second
{
    public static void main(String[] args) {
        Plane plane1 = new Plane("Scat", "n249f", 200, 1.5, 8);
        Plane plane2 = new Plane("FlyArystan", "9b3", 150, 2, 10);
        Plane plane3 = new Plane("Scat", "b299a", 100, 3.5, 11);
        Plane plane4 = new Plane("Scat", "n822s", 120, 4, 12);
        Plane plane5 = new Plane("FlyArystan", "9m5", 100, 5, 12);

        Plane[] arr = {plane1, plane2, plane3, plane4, plane5};
        System.out.println(maxPassengers(arr));
        maxTime(arr);
    }

    public static int maxPassengers(Plane[] arr)
    {
        int maxPass = arr[0].numberOfPassengers;
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].numberOfPassengers>maxPass)
            {
                maxPass = arr[i].numberOfPassengers;
            }
        }
        return maxPass;
    }

    public static void maxTime(Plane[] arr)
    {
        Plane plane = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].flightTime > plane.flightTime)
            {
                plane = arr[i];
            }
        }
        System.out.println("The longest time flight is " + plane.flightName + ". Its flight time is " + plane.flightTime);
    }
}

class Plane
{
    public String airlineName;
    public String flightName;
    public int numberOfPassengers;
    public double flightTime;
    public double flightAltitude;

    public Plane(){};
    public Plane(String airlineName, String flightName, int numberOfPassengers, double flightTime, int flightAltitude) {
        this.airlineName = airlineName;
        this.flightName = flightName;
        this.numberOfPassengers = numberOfPassengers;
        this.flightTime = flightTime;
        this.flightAltitude = flightAltitude;
    }

    public void gainHeight()
    {
        flightAltitude+=1.5;
    }
}
