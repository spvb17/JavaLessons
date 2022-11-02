package methods.homeworkTasks;
//Given an array of integers, create a method that replaces all even numbers in the array with zeros and returns that array.
public class Eighth
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 3, 7, 6};
        replaceEvenOnes(arr);
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] replaceEvenOnes(int[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]%2==0)
            {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
