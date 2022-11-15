package interfaces.examples.thirdExample;

public class Main
{
    public static void main(String[] args) {
        Printable book = new Book("The great Gatsby");
        Printable book1 = new Book("Harry Potter");
        Printable magazine = new Magazine("Sport");
        Printable magazine1 = new Magazine("Forbs");
        Printable[] arr = {book, book1, magazine, magazine1};
        Magazine.printMagazines(arr);
        Book.printBooks(arr);
        //Magazine magazine2 = new Magazine();
        //magazine2.printMagaz();
    }
}
