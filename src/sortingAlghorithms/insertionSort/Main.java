package sortingAlghorithms.insertionSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 2, -1, 10, 8, 7};
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
            while(j>=0 && key>arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
