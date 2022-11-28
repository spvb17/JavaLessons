package serialization.homework.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Deserialize
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("emps.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee[] firstArray = (Employee[]) ois.readObject();
        Employee[] secondArray = (Employee[]) ois.readObject();
        someMethod(firstArray);
        someMethod(secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        Company company1 = new Company(1, "Google", firstArray);
        Company company2 = new Company(2, "Yandex", secondArray);

        ois.close();
    }

    public static void someMethod(Employee[] arr)
    {
        for(Employee x:arr)
        {
            if(x.getExperience()<2)
            {
                x.setSalary(x.getSalary()/2);
            }
        }
    }
}
