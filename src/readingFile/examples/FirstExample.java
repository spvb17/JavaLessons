package readingFile.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FirstExample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("numbers");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        int[] arr1 = new int[8];
        int j = 0;
        for(String i:arr)
        {
            arr1[j++] = Integer.parseInt(i);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(theSecondMax(arr1));
        scanner.close();
    }

    public static int theSecondMax(int[] arr)
    {
        int firstMax = arr[0];//1
        int secondMax = 0;
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]>firstMax)
            {

                firstMax = arr[i];
            }
        }
        return firstMax;
    }
}
