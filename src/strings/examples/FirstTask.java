package strings.examples;
//Ввести любую строку, если строка содержит первую букву вашего имени вывести true, если нет - false

import java.util.Scanner;

public class FirstTask{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = cin.nextLine();
        for(int i=0; i<string.length(); ++i)
        {
            if(string.charAt(i)=='b' && i == 0)
            {
                System.out.println(true);
            }
        }
    }
}
