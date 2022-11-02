package methods.homeworkTasks;
//Given a string value, create a method that returns the number of vowels in a string.
public class Fifth
{
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String str = "skylearn";
        System.out.println(numberOfVowels(str, vowels));
    }

    public static int numberOfVowels(String str, char[] vowels)
    {
        int length = 0;
        for(int i=0; i<str.length(); ++i)
        {
            for(int j=0; j<vowels.length; ++j)
            {
                if(str.charAt(i) == vowels[j])
                {
                    length++;
                }
            }
        }
        return length;
    }
}
