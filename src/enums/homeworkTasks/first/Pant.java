package enums.homeworkTasks.first;

public class Pant extends Cloth
{
    private String gender;
    private String pantType;

    public Pant(){}
    public Pant(Size size, String color, String gender, String pantType)
    {
        super(size, color);
        this.gender = gender;
        this.pantType = pantType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPantType() {
        return pantType;
    }

    public void setPantType(String pantType) {
        this.pantType = pantType;
    }
}
