package readingFile;

//запись в файл, чтение из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

//В java существует два типа переменных. Примитивы и ссылочные типы данных
//Для каждого примитивного типа существует, соответствующий ему ссылочный тип
//Autoboxing, autounboxing
public class Main
{
    //Double, Float, Long, Integer, Short, Byte, Character, Boolean - классы обертки
    //Wrappers
    public static void main(String[] args) throws FileNotFoundException {
//        int a = 5;
//        Integer b = 5;
//
//        String c = "123";
//        int d = Integer.parseInt(c);
//        System.out.println(d+1);
//
//        Integer u = 987;  //autoboxing
//        int j = b; //autounboxing


//        File file = new File("C:\\Users\\Пользователь\\Downloads\\newfile.txt");
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String[] arr = line.split(" ");
//        int[] arr1 = new int[3];
//        int j = 0;
//        //foreach
//        for(String i:arr)
//        {
//            arr1[j++] = Integer.parseInt(i);
//        }
//        System.out.println(Arrays.toString(arr1));

        File file = new File("filefile");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("first line");
        printWriter.println("second line");
        printWriter.println("third line");

        printWriter.close();
    }
}
