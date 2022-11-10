package inheritanceAndEncapsulation.examples.secondTask;

public class Main
{
    public static void main(String[] args) {
        Student student1 = new Student(2900, "123@mail", "qwerty123", "Begzhan", "Saparaliev", 3.2, new String[]{"architecture", "web", "frontend"});
        Student student2 = new Student(3900, "123@gmail.com", "123456789", "Saparali", "Begzhanov", 3.3, new String[]{"backend", "frontend", "se"});
        Staff staff1 = new Staff(1000, "123.dfa", "234243", "asan", "usenov", 100000.500, new String[]{"Math", "Physics"});
        User[] arr = {student1, student2, staff1};
        Student[] arr1 = {student1, student2};
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getData());
        }
    }
}
