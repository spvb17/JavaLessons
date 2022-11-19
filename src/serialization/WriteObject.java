package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject
{
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(12, "Robert");
        Person person2 = new Person(23, "Max");
        Person person3 = new Person(34, "Mike");
        Person person4 = new Person(45, "Sadie");
        Person[] people = {person1, person2, person3, person4};


        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(people);

        oos.close();
    }
}
