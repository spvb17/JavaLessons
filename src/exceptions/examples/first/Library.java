package exceptions.examples.first;

import java.util.Arrays;

public class Library
{
    private String name;
    private String city;
    private Book[] books = new Book[2];
    private int index = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book)
    {
        try{
            books[index++] = book;
            //books[3] = book;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The library is full");
        }
        finally {
            System.out.println("Finally block");
        }
    }

    public void printBooks()
    {
        for(Book x:books)
        {
            try{
                System.out.println(x.toString());
            }
            catch(NullPointerException e)
            {
                System.out.println("The book is empty");
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", books=" + Arrays.toString(books) +
                ", index=" + index +
                '}';
    }
}
