package methods.homeworkTasks;
//Given two string values, create a method that returns the longer string. If the length of these strings are equal, return the first string
public class Sixth
{
    public static void main(String[] args) {
        String str1 = "java language";
        String str2 = "python language";
        System.out.println(longerString(str1, str2));
    }

    public static String longerString(String str1, String str2)
    {
        if(str1.length()>str2.length())
        {
            return str1;
        }
        return str2;
    }
}
