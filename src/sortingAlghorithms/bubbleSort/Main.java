package sortingAlghorithms.bubbleSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 9};

        int n = arr.length;
        for(int i=0; i<n-1; ++i)
        {
            for(int j=0; j<n-1-i; ++j)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //ArrayList, LinkedList, Map, Tree, Set
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
