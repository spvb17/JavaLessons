package methods.examples;
//Создайте метод, который будет принимать целочисленное значение и возвращать true если число нечетное, false если четное
public class SecondTask
{
    public static void main(String[] args) {
        int a = 24;
        System.out.println(isOdd(a));
    }

    public static boolean isOdd(int a)
    {
        if(a%2==1)
        {
            return true;
        }
        return false;
    }
}
