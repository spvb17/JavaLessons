package interfaces.examples.firstExample;

public class Main
{
    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        Plane plane = new Plane();
        Scooter scooter = new Scooter();

        automobile.startEngine();
        automobile.move();
        scooter.startEngine();
        plane.startEngine();
    }
}
