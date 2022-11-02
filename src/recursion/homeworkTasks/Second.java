package recursion.homeworkTasks;
//Given a three-digit number, multiply all the digits of this number using the recursive method.
public class Second
{
    public static void main(String[] args) {
        int n = 127;
        System.out.println(multiply(n));
    }

    public static int multiply(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n%10 * multiply(n/10);
    }
}
