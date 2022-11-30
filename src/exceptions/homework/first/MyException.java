package exceptions.homework.first;

public class MyException extends Exception
{
    public MyException(String description)
    {
        super(description);
    }

    @Override
    public void printStackTrace() {
        System.out.println("");
    }
}
