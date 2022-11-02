package recursion.examples;
//Найдите факториал числа
//4*3*2*1 = 24
public class FifthTask
{
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }

    public static int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
