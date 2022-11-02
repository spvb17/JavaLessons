package methods.examples;
//Создайте метод который будет принимать во вход целочисленный массив и будет возвращать массив где каждый элемент исходного массива
//равный одному будет заменен нулем
public class FourthTask
{
    public static void main(String[] args) {
        int[] arr = {9, 1, 0, 2, 3, 11, 1};
        replacementOnes(arr);
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] replacementOnes(int[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] == 1)
            {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
