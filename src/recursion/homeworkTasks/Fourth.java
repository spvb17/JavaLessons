package recursion.homeworkTasks;
//Find the double factorial of a number using the recursive method
public class Fourth
{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(doubleFactorial(n));
    }

    public static int doubleFactorial(int n)
    {
        if(n<=2)
        {
            return n;
        }
        return n * doubleFactorial(n-2);
    }
}
