package enums.homeworkTasks.first;

public abstract class Cloth
{
    private Size size;
    private String color;

    public Cloth(){}
    public Cloth(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
