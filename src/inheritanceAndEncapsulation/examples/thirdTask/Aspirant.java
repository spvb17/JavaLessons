package inheritanceAndEncapsulation.examples.thirdTask;

public class Aspirant extends Student
{
    private String work;

    public Aspirant(){};
    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getScholarship()
    {
        if(getAvgMark() == 5.0)
        {
            return 200;
        }
        return 180;
    }

    @Override
    public String toString() {
        return getFirstName() + getAvgMark() + getLastName() + getWork();
    }
}
