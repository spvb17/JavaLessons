package serialization.homework.first;

import java.io.*;

public class Serialize
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Employee emps1 = new Employee("Zaur", "Tregulov", 33, "manager", 1000, 5);
        Employee emps2 = new Employee("Nurdana", "Amanali", 22, "hr", 1000, 2);
        Employee emps3 = new Employee("Askar", "Alishev", 25, "developer", 2000, 4);
        Employee[] firstArray = {emps1, emps2, emps3};

        Employee emps21 = new Employee("Neil", "Alishev", 25, "developer", 500, 1);
        Employee emps22 = new Employee("Andrey", "Andreev", 20, "hr", 400, 2);
        Employee emps23 = new Employee("Guldana", "Amanali", 26, "manager", 800, 4);
        Employee[] secondArray = {emps21, emps22, emps23};

        FileOutputStream fos = new FileOutputStream("emps.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(firstArray);
        oos.writeObject(secondArray);

        oos.close();
    }
}
