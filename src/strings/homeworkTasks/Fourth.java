package strings.homeworkTasks;
//Напишите программу, чтобы получить длину заданной строки, пробелы и запятые не учитываются. Используйте цикл.
public class Fourth
{
    public static void main(String[] args) {
        String str = "Javaprogram";
        int length = 0;
        for(int i=0; i<str.length(); ++i)
        {
            if(str.charAt(i) != ' ' && str.charAt(i)!=',' )
            {
                length++;
            }
        }
        System.out.println(length);
        System.out.println(str.length());
    }
}
