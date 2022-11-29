package exceptions.examples.first;

public class Main
{
    public static void main(String[] args) {
        Library library = new Library();
        library.setName("Aleksandrina");
        library.setCity("Aleksandria");

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Dorian Gray");
        book1.setAuthor("Oskar Wilde");

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("Abai joly");
        book2.setAuthor("Mukhtar Auezov");

        Book book3 = new Book();
        book3.setId(3);
        book3.setName("Some book");
        book3.setAuthor("Some author");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }
}
