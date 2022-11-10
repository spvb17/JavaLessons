package inheritanceAndEncapsulation.examples.secondTask;

import java.util.Arrays;

public class Student extends User
{
    private double gpa;
    private String[] courses;

    public Student(double gpa, String[] courses) {
        this.gpa = gpa;
        this.courses = courses;
    }

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getData()
    {
        return id+" "+login+" "+password+" "+name+" "+surname+" "+gpa+ " " + Arrays.toString(courses);
    }
}
