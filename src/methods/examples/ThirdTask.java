package methods.examples;
//Создайте метод который будет принимать во вход строковое значение и будет возвращать последний символ строки
public class ThirdTask
{
    public static void main(String[] args) {
        String str = "methods";
        System.out.println(lastSymbol(str));
    }

    public static char lastSymbol(String str)
    {
        int n = str.length()-1;
        return str.charAt(n);
    }
}
