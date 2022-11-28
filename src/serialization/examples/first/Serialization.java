package serialization.examples.first;

import java.io.*;

public class Serialization
{
    public static void main(String[] args) throws IOException
    {
        Person person1 = new Person(1, "Michael", "Jordan");
        Person person2 = new Person(2, "Lionel","Messi");


        FileOutputStream fileOutputStream = new FileOutputStream("person.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person1);
        objectOutputStream.writeObject(person2);

        objectOutputStream.close();
    }
}
