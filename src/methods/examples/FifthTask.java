package methods.examples;
//Создайте метод который будет принимать строку во вход и возвращать эту строку в верхнем регистре
public class FifthTask
{
    public static void main(String[] args) {
        String str = "Returning string";
        System.out.println(upperString(str));
    }

    public static String upperString(String str)
    {
        str = str.toUpperCase();
        return str;
    }
}
