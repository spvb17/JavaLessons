package methods.homeworkTasks;
//Given three integer variables, create a method that returns the arithmetic mean of these numbers
public class Third
{
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c= 14;
        System.out.println(avg(a, b, c));
    }

    public static int avg(int a, int b, int c)
    {
        return (a+b+c)/3;
    }
}
