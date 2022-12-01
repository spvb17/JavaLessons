package sortingAlghorithms.insertionSort.examples;

import java.util.Arrays;

//Нам дан массив, отсортировать его так чтобы все нули находились с левой стороны
public class First
{
    public static void main(String[] args) {
        int[] arr = {9, 0, 1, 0, -1, 5, 2, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr)
    {
        int size = arr.length;
        for(int i=1; i<size; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key==0)
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
