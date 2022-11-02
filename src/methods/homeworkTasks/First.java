package methods.homeworkTasks;
//Given an integer, create a method that returns true if the number is even, false otherwise.
public class First
{
    public static void main(String[] args) {
        int a = 9;
        System.out.println(isEven(a));
    }

    public static boolean isEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        return false;
    }
}
