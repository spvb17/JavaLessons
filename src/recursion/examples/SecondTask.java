package recursion.examples;
//Преобразовать десятичное число в двоичное
public class SecondTask
{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(binary(a));
    }

    public static int binary(int a)
    {
        if(a == 0)
        {
            return 0;
        }
        return a%2 + 10*binary(a/2);
    }
}
