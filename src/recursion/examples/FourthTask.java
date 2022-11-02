package recursion.examples;
//Сложите все числа до заданного, используя рекурсивный метод
public class FourthTask {
    public static void main(String[] args) {
        int n = 4;
        //1 + 2 + 3 + 4 = 10
        System.out.println(sum(n));
    }

    public static int sum(int n)
    {
        if(n>0)
        {
            return n+sum(n-1);
        }
        return 0;
    }
}
