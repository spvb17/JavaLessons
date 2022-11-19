package readingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Пользователь\\Downloads\\filereading.txt");
        Scanner cin = new Scanner(file);
        while(cin.hasNextLine())
        {
            System.out.println(cin.nextLine());
        }
    }
}
