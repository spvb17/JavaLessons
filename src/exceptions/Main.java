package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

//В Java, исключение – это специальный объект, описывающий исключительную ситуацию,
//которая возникла в некоторой части программного кода.

//Исключительная ситуация - это нежелательное или неожиданное событие, возникающее во время выполнения программы, т. е. что-то что,
//нарушает нормальный ход инструкций программы.

//Выбрасывать исключения
//Ловить исключения
//Обработка исключений

//блок try catch

//Обработка исключений из других методов

//Checked, unchecked

//Checked exception(compile time exception) - Исключительные случаи в работе программы
//Unchecked exception(runtime exception) - Ошибка в логике программы

//Создание собственных исключений
public class Main
{
    public static void main(String[] args) {
//        File file = new File("numbers");
//        try {
//            //System.out.println("Before scanner");
//            Scanner scanner = new Scanner(file);
//            //System.out.println("After scanner");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found, you entered wrong file name");
//        }

//        try{
//            someMethod();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        int a = 0;
//        int b = 5;
//        System.out.println(b/a);

        int[] arr = new int[10];
        System.out.println(arr[9]);
    }
//
//    public static void someMethod() throws FileNotFoundException {
//        File file = new File("nums");
//        Scanner scanner = new Scanner(file);
//    }
}
