package oop.examples;

public class FirstTask
{
    public static void main(String[] args) {
        Student studnent1 = new Student(29656, "Samat", "Myrzatayev", 2.9);
        Student student2 = new Student(29400, "Asan", "Usenov", 3.5);
        Student student3 = new Student(29500, "Marat", "Muratov", 3.8);
        Student student4 = new Student(29516, "Renat", "Ilyinov", 2.5);
        Student student5 = new Student(29815, "Rozalina", "Amalbek", 3.9);
        Student[] arr = {studnent1, student2, student3, student4, student5};
//        for(int i=0; i<arr.length; ++i)
//        {
//            System.out.println(arr[i].getStudentData());
//        }
        topStudent(arr);
    }

    public static void topStudent(Student[] arr)
    {
        Student student = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].gpa > student.gpa)
            {
                student = arr[i];
            }
        }
        System.out.println("The best student is " + student.getStudentData());
    }
}

class Student
{
    public int id;
    public String name;
    public String surname;
    public double gpa;

    public Student(){};
    public Student(int id, String name, String surname, double gpa)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData()
    {
        return "My name is " + name + " " + surname + ". My id is " + id + ", and my gpa is " + gpa;
    }


}
