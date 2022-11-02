package methods.examples;
//Создайте метод который будет принимать целочисленное значение и возвращать квадрат этого числа
public class FirstTask
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(square(a));
    }

    public static int square(int a)
    {
        return a*a ;
    }
}
