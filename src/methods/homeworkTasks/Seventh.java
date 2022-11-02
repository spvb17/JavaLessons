package methods.homeworkTasks;
//Given a string value, create a method that returns its first vowel. If the word contains no vowels, return the first letter of the string.
public class Seventh
{
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String str = "Returning char";
        System.out.println(firstVowel(str, vowels));
    }

    public static char firstVowel(String str, char[] vowels)
    {
        for(int i=0; i<str.length(); ++i)
        {
            for(int j=0; j<vowels.length; ++j)
            {
                if(str.charAt(i) == vowels[j])
                {
                    return str.charAt(i);
                }
            }
        }
        return str.charAt(0);
    }
}
