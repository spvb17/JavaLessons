package exceptions.homework.second;

public class DatabaseIncorrectException extends Exception
{
    @Override
    public void printStackTrace() {
        System.out.println("Java Connection Exception at DatabaseDriver caused by incorrect data");
    }
}
