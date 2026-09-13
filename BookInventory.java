class Book
{
    String title;
    String author;
    int copiesAvailable;

    Book(String title, String author, int copiesAvailable)
    {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry()
    {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }
}

public class BookInventory
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Clean Code", "Robert C. Martin", 3);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 5);
        Book b3 = new Book("Refactoring", "Martin Fowler", 0);
        Book b4 = new Book("Design Patterns", "GoF", 2);

        Book[] books = {b1, b2, b3, b4};

        for (Book book : books)
        {
            book.printEntry();
        }
    }
}