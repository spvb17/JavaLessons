package polymorphism.examples.secondTask;



public class Main
{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Square square = new Square();
        square.area();
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(5, 4, 0.5);
        triangle.area(3, 4, 5, 6);
        Circle circle = new Circle();
        circle.area();
    }
}
