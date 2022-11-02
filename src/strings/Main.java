package strings;

//String - тип данных, которая хранит строки, последовательность символов char
//Является ссылочным типом данных, отличие в том что, притивы хранят само значение, ссылочные хранят ссылку на значение
//Можно создать двумя способами
//Является неизменяемым, измененная строка является уже другим объектом. Это свойство называется иммутабельность
//Для создания изменяемых строк используется StringBuilder

public class Main
{
    public static void main(String[] args)
    {
        //как выглядит string изнутри
        //private final char[] value;
        char[] array = {'C', 'h', 'a', 'r'};
        System.out.println(array);

        //Способы создания
        String name = new String("Begzhan"); //С помощью конструктора класса, хранится в самой куче
        String surname = "Saparaliev"; //С помощью литерала, хранится в string pool
        System.out.println(name);
        System.out.println(surname);
        surname = surname+"dfadf";
        System.out.println(surname);

        //Используется для создания изменяемых строк
        StringBuilder stringBuilder = new StringBuilder("changeable");
        System.out.println(stringBuilder);
        stringBuilder.append(" string");
        stringBuilder = new StringBuilder("dfaddfa");
        System.out.println(stringBuilder);

        //Методы для работы со стринг
         String str = "methods";
         String str1 = "methods";
        System.out.println(str.charAt(3)); //возвращает индекс указанного символа
        System.out.println(str.length());  //возвращает длину строки
        System.out.println(str.contains("d"));  //возвращает true если есть такой символ или подстрока
        System.out.println(str.equals("methods"));  //возвращает true если строка равна указанному значению
        System.out.println(str.equals(str1));
        System.out.println(str.isEmpty());  //возвращает true если строка пустая
        System.out.println(str.indexOf("m"));  //возврващает индекс символа
        System.out.println(str.toLowerCase());  //возвращает строку в нижнем регистре
        System.out.println(str.toUpperCase());  //возвращает строку в верхнем регистре
        System.out.println(str.split(" "));  //делит строки на подстроки

        //Итерирование строки
        String iteration = "string iteration";
        for(int i=0; i<iteration.length(); ++i)
        {
            System.out.println("i = " + i);
            System.out.print(iteration.charAt(i)+" ");
        }
    }
}
