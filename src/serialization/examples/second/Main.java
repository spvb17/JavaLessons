package serialization.examples.second;

import serialization.examples.second.Car;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("cars.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car[] cars =(Car[]) objectInputStream.readObject();
        for(Car i:cars)
        {
            System.out.println(i);
        }
        objectInputStream.close();
    }
}
