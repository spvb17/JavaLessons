package strings.homeworkTasks;
//Напишите программу, чтобы получить индекс каждого символа строки в алфавите
public class Third
{
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r',
                            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String str = "computer";
        for(int i=0; i<str.length(); ++i)
        {
            for(int j=0; j<alphabet.length; ++j)
            {
                if(str.charAt(i) == alphabet[j])
                {
                    System.out.println(j+1);
                }
            }
        }
    }
}
