package strings.homeworkTasks;
//Напишите программу, чтобы проверить, содержат ли два объекта String одни и те же данные. Используйте для этого цикл.
public class Second
{
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "hello world";
        for(int i=0; i<str1.length(); ++i)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                System.out.println("false");
                break;
            }
            if(i == str1.length()-1)
            {
                System.out.println("true");
            }
        }
    }
}
