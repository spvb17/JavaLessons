package sortingAlghorithms.homework.first;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 2, 5, 9, 8, 5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr)
    {
        for(int i=0; i<arr.length-1; ++i)
        {
            for(int j=0; j<arr.length - i - 1; ++j)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
