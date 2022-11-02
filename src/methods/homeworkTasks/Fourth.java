package methods.homeworkTasks;
//Given a three-digit integer, create a method that swaps the first and last digits and returns the new number.
public class Fourth
{
    public static void main(String[] args) {
        int a = 249;
        System.out.println(swapDigits(a));
    }

    public static int swapDigits(int a)
    {
        int b = (a%10 * 100) + (a%100 - a%10) + a/100;
        return b;
    }
}
