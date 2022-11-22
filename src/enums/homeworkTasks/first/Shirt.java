package enums.homeworkTasks.first;

public class Shirt extends Cloth
{
    private String gender;

    public Shirt(){}
    public Shirt(Size size, String color, String gender) {
        super(size, color);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
