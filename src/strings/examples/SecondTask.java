package strings.examples;
/*Напишите функцию для преобразования имени в инициалы. Это ката строго состоит из двух слов с одним пробелом между ними.
На выходе должны быть две заглавные буквы с точкой, разделяющей их.*/

public class SecondTask
{
    public static void main(String[] args) {
        String nameSurname = "Begzhan Saparaliev";
        String[] arr = nameSurname.split(" ");
        String name = arr[0];
        String surname = arr[1];
        char firstInitial = name.charAt(0);
        char secondInitial = surname.charAt(0);
        String newString = firstInitial + "."+secondInitial+".";
        System.out.println(newString);
    }
}
