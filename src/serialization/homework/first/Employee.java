package serialization.homework.first;

import java.io.Serializable;

public class Employee implements Serializable
{
    private String name;
    private String surname;
    private int age;
    private String position;
    private int salary;
    private int experience;

    public Employee(){}
    public Employee(String name, String surname, int age, String position, int salary, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
