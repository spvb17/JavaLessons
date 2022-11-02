package strings.examples;
//Напишите функцию, которая разбивает строку и преобразует ее в массив слов.

import java.util.Arrays;

public class ThirdTask
{
    public static void main(String[] args) {
        String str = "notebook";
        String[] arr = str.split("b");
        System.out.println(Arrays.toString(arr));
    }
}
