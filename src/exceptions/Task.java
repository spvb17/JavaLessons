package exceptions;

import java.io.IOException;

public class Task
{
    public static void main(String[] args) {

    }

    public static boolean someMethod(String login, String password, String confirmPassword)
    {
        if(login.length()>20)
        {
            try{
                throw new IOException();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return true;
    }
}
