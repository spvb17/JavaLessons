package recursion.examples;
//Найдите степень числа с помощью рекурсии
public class FirstTask
{
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(power(a, b));
    }

    public static int power(int a, int b)
    {
        if(b!=0)
        {
            return a*power(a, b-1);
        }
        return 1;
    }
}
