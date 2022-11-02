package strings.homeworkTasks;
//Напишите программу, которая считает количество гласных и согласных букв в заданной строке.
public class Seventh
{
    public static void main(String[] args) {
        char[] arr1 = {'a', 'e', 'i', 'o', 'y'};
        char[] arr2 = {'b', 'c', 'd', 'f','g'};
        int length1 = 0;
        int length2 = 0;
        String str = "goodbye";
        for(int i=0; i<str.length(); ++i)
        {
            for(int j=0; j<arr1.length; ++j)
            {
                if(str.charAt(i) == arr1[j])
                {
                    length1++;
                }
                else if(str.charAt(i) == arr2[j])
                {
                    length2++;
                }
            }
        }
        System.out.println(length1);
        System.out.println(length2);
    }
}
