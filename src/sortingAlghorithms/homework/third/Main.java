package sortingAlghorithms.homework.third;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        double[] arr = {2.4, 9.5, 0.1, -5.2, 1.6, -4.0, 8, -7.2};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(double[] arr)
    {
        int size = arr.length;
        for(int i=1; i<size; ++i)
        {
            double key = arr[i];
            int j = i-1;
            while(j>=0 && key<0)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
