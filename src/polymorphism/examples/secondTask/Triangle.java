package polymorphism.examples.secondTask;

public class Triangle extends Shape
{
    public void area()
    {
        System.out.println("0.5*a*h");
    }

    public void area(int a, int b, double sin)
    {
        System.out.println((a*b*sin)/2);
    }

    public void area(int a, int b, int c, int r)
    {
        System.out.println((a*b*c)/4*r);
    }
}
