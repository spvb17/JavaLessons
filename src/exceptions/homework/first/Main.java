package exceptions.homework.first;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n;
        while(true)
        {
            n = scanner.nextInt();
            if(n!=0)
            {
                try {
                    throw new MyException("Number is not equal to 0");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
