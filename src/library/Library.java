package library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library() {
        books = new ArrayList<Book>();
        members = new ArrayList<Member>();
    }
    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }
    // Method to add a member
    public void addMember(Member member) {
        members.add(member);
    }
    // Method to list all books
    public void listBooks() {
        System.out.println("*************************************************************");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " +
                    book.getAuthor());
        }
        System.out.println("*************************************************************");
    }

    // Method to find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    public void removeBook(String title) {
        // Validate the input title
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Title cannot be null or empty.");
            return;
        }

        // Check if the book exists
        Book bookToRemove = findBookByTitle(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove); // Remove the book from the list
            System.out.println("Book '" + title +"' removed");
        } else {
            System.out.println("This book doesn't exist!"); // Inform the user
        }
    }
}