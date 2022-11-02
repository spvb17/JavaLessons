package recursion.homeworkTasks;
//Find sum of array elements using recursive method
public class Fifth
{
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 9, 10};
        int i=0;
        System.out.println(sumOfElements(arr, i));
    }

    public static int sumOfElements(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            return arr[i];
        }
        return arr[i] + sumOfElements(arr, i+1);
    }
}
