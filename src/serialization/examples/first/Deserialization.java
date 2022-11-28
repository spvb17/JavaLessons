package serialization.examples.first;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("person.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        objectInputStream.close();
    }
}
