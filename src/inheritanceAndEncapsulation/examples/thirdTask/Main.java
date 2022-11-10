package inheritanceAndEncapsulation.examples.thirdTask;

public class Main
{
    public static void main(String[] args) {
        Aspirant student1 = new Aspirant("Murat", "Maratov", "it2-2006", 5.0, "computer science");
        Aspirant student2 = new Aspirant("Asan", "Usenov", "9ii2", 6.0, "web technologies");
        Student student3 = new Student("Aida", "Amalbek", "939402s", 5.0);
        Student student4 = new Student("Rozalina", "Amalbek", "932kk", 3.6);
        Student[] arr = {student1, student2, student3, student4};
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getScholarship());
        }
    }
}
