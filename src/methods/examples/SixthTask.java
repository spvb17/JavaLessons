package methods.examples;
//Write a Java program to reverse a string using recursion.
public class SixthTask
{
    public static void main(String[] args) {
        String str = "reverse";
        reverse(str);
    }

    public static void reverse(String str)
    {
        if(str.length()<=1)
        {
            System.out.println(str);
        }
        else
        {
            System.out.print(str.charAt(str.length()-1)+" ");
            reverse(str.substring(0, str.length()-1));
        }
    }
}
