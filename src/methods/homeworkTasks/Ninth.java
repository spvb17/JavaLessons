package methods.homeworkTasks;

import java.util.Arrays;

//Given an array of integers.
//Return an array, where the first element is the count of positives numbers, and the second element is sum of negative numbers.
//0 is neither positive nor negative.
public class Ninth
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] a = posAndNegNumbers(arr);
        for(int i=0; i<a.length; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(a[0]+", "+a[1]);
    }

    public static int[] posAndNegNumbers(int[] arr)
    {
        int countPositive = 0;
        int countNegative = 0;
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]!=0)
            {
                if(arr[i]>0)
                {
                    countPositive++;
                    continue;
                }
                countNegative+=arr[i];
            }
        }
        int[] newArray = {countPositive, countNegative};
        return newArray;
    }
}
