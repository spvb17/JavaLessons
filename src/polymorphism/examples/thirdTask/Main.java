package polymorphism.examples.thirdTask;

public class Main
{
    public static void main(String[] args) {
        Book[] arr = new Book[100];
        Library library = new Library("Pushkin", "Shymkent", "Kazakhstan");
        ScientificBook scientificBook = new ScientificBook("Cosmos", "a123b", 500, 10000, "Nasa");
        ScientificBook scientificBook1 = new ScientificBook("Packing of Mars", "422k", 600, 20000, "Nasa");
        library.addBook(scientificBook);
        library.addBook(scientificBook1);
        library.printLibraryData();
    }
}
