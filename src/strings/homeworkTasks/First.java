package strings.homeworkTasks;
//Напишите программу для создания нового объекта String с содержимым массива символов.
public class First
{
    public static void main(String[] args) {
        char[] arr = {'l', 'a', 'p', 't', 'o', 'p', ' ', '1'};
        String string = new String(arr);
        System.out.println(string);
    }
}
