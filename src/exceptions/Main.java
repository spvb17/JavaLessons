package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//В языке программирования Java, исключение – это специальный объект, описывающий исключительную ситуацию,
//которая возникла в некоторой части программного кода.

//Исключительная ситуация – это программная ошибка, которая возникает во время выполнения последовательности программного кода.
//Программная ошибка может быть логической ошибкой программиста во время разработки программы.

//Обработка исключений
//Выбрасывание исключений
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        Scanner scanner = new Scanner(file);
    }
}
