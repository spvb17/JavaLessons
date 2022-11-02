package methods.examples;
//Задан массив чисел, разработать рекурсивный метод, который находит сумму элементов массива
public class SeventhTask
{
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 8, 9, 10};
        int i=0;
        System.out.println(sum(i, arr));

    }

    public static int sum(int i, int[] a)
    {
        if(i==(a.length-1))
        {
            return a[i];
        }
        return a[i] + sum(i+1, a);
    }
}
