package serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fos);
        Person[] arr = (Person[]) ois.readObject();
        System.out.println(Arrays.toString(arr));

        ois.close();
    }
}
