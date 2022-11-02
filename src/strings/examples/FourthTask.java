package strings.examples;
/*Напишите функцию, которая берет массив слов, объединяет их в предложение и возвращает предложение.
        Вы можете игнорировать необходимость очистки слов или добавления знаков препинания,
        но вы должны добавлять пробелы между каждым словом. Будьте внимательны, не должно быть пробела
        ни в начале, ни в конце предложения!*/

public class FourthTask
{
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length(); ++i)
        {
            stringBuilder.append(str.charAt(i));
            if(str.charAt(i)==' ')
            {
                continue;
            }
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
