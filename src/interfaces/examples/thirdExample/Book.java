package interfaces.examples.thirdExample;

public class Book implements Printable
{
    private String name;

    public Book(){};
    public Book(String name)
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
        System.out.println("Book's name is " + getName());
    }

    public static void printBooks(Printable[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] instanceof Book)
            {
                arr[i].print();
            }
        }
    }
}
