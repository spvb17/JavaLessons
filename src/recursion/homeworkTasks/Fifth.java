package recursion.homeworkTasks;

public class Fifth
{
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 9, 10};
        int i=0;
        System.out.println(reverseArray(arr, i));
    }

    public static int reverseArray(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            return arr[i];
        }
        return arr[i] + reverseArray(arr, i+1);
    }
}
