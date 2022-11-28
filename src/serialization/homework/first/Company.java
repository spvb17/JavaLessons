package serialization.homework.first;

import java.util.Arrays;

public class Company
{
    private transient int companyId;
    private String companyName;
    private Employee[] employees;


    public Company(){}
    public Company(int companyId, String companyName, Employee[] employees) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.employees = employees;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public static double avgSalary(Employee[] emps)
    {
        double avgSal = 0;
        for(Employee x:emps)
        {
            avgSal += x.getSalary();
        }
        return avgSal/emps.length;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
