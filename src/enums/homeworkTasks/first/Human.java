package enums.homeworkTasks.first;

public class Human
{
    private String name;
    private String gender;
    private Size size;

    public Human(String name, String gender, Size size)
    {
        this.name = name;
        this.gender = gender;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public void isPantFit(Pant[] arr)
    {
        int j=0;
        for(Pant i:arr)
        {
            j++;
            if(i.getGender().equals(gender) && i.getSize().equals(size))
            {
                System.out.println("Pant " + j + " suits " + name);
            }
        }
    }

    public void isTshirtFit(Tshirt[] arr)
    {
        int j=0;
        for(Tshirt i:arr)
        {
            j++;
            if(i.getSize().equals(size))
            {
                System.out.println("Tshirt " + j + " suits " + name);
            }
        }
    }

    public void isShirtFit(Shirt[] arr)
    {
        int j = 0;
        for(Shirt i:arr)
        {
            j++;
            if(i.getSize().equals(size) && i.getGender().equals(gender))
            {
                System.out.println("Shirt " + j + " suits " + name);
            }
        }
    }
}
