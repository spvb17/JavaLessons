package enums.examples.first;

import jdk.swing.interop.SwingInterOpUtils;

public class Main
{
    public static void main(String[] args) {
        //values() - возвращает массив, который хранит все значения нашего перечисления
        //valueOf() - он возвращает константу перечисляемого типа
        //ordinal() - который возврщаает порядковый номер объекта в перечислении
//        Day[] arr = Day.values();
//        someMethod(arr);
        Day day = Day.TUESDAY;
        System.out.println(day.toString());
    }

    public static void someMethod(Day[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getTranslation());
        }
    }
}
