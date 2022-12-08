package sortingAlghorithms.homework.second;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] arr = {"string", "insertion", "sort", "bubble", "algorithm", "main", "white", "is"};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(String[] arr)
    {
        int size = arr.length;
        for(int i=1; i<size; ++i)
        {
            String key = arr[i];
            int j = i-1;
            while(j>=0 && key.length() > arr[j].length())
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
