package exceptions.examples.second;

//Создать метод который в параметры принимает String login, String password, String confirmPassword
//Если login меньше 5 знаков или password и confirmPassword не совпадают выбросить IOException

import java.io.IOException;
import java.util.Scanner;

public class Task
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        System.out.println("Confirm password");
        String confirmPassword = scanner.nextLine();
        System.out.println(someMethod(login, password, confirmPassword));
    }

    public static boolean someMethod(String login, String password, String confirmPassword)
    {
        try
        {
            if(login.length()<5 || !password.equals(confirmPassword))
            {
                throw new MyException("My exception was called");
            }
        }
        catch(MyException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}