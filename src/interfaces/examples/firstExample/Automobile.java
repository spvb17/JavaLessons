package interfaces.examples.firstExample;

public class Automobile implements Engine, Moveable
{
    public void startEngine()
    {
        System.out.println("Drdrdrdr");
    }

    public void move()
    {
        System.out.println("Auto is moving");
    }
}
