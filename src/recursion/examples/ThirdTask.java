package recursion.examples;
//Вывести сумму цифр числа
public class ThirdTask
{
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }
}
