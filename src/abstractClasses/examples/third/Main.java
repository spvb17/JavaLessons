package abstractClasses.examples.third;

public class Main
{
    public static void main(String[] args) {
        Student stud1 = new Student(333, "dfa.kz", "1234", "Begzhan", "Saparaliev", "it2-22", 3.3);
        Student stud2 = new Student(444, "fs.kz", "1234592", "Aida", "Amalbek", "it2-2300", 3.9);

        User[] arr = {stud1, stud2};
        for(int i = 0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getUserData());
        }
    }
}
