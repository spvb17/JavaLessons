package methods.homeworkTasks;
//Given three integer variables, create a method that returns the smallest of them.
public class Second
{
    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        int c = 17;
        System.out.println(smallestOne(a, b, c));
    }

    public static int smallestOne(int a, int b, int c)
    {
        if(a<b && a<c)
        {
            return a;
        }
        if(b<a && b<c)
        {
            return b;
        }
        return c;
    }
}
