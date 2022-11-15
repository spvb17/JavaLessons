package interfaces.examples.thirdExample;

public class Magazine implements Printable
{
    public static int a = 5;
    private String name;

    public Magazine(){};
    public Magazine(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println("Magazine's name is "+getName());
    }

    public static void printMagazines(Printable[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] instanceof Magazine)
            {
                arr[i].print();
            }
        }
    }
}
