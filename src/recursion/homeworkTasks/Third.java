package recursion.homeworkTasks;
//Multiply all numbers starting from three up to the given number
public class Third
{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(multiply(n));
    }

    public static int multiply(int n)
    {
        if(n == 3)
        {
            return 3;
        }
        return n * multiply(n-1);
    }
}
