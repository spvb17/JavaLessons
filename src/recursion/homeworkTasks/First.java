package recursion.homeworkTasks;
//Create a recursive method that will output "hello world". The recursion should work 3 times
public class First
{
    public static void main(String[] args) {
        int count = 0;
        method(count);
    }

    public static void method(int count)
    {
        if(count == 3)
        {
            return;
        }
        System.out.println("hello world");
        method(count+1);
    }
}
