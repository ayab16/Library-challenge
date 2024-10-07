import library.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Create books
        Book book1 = new Book("Java Programming", "John Doe");

//    Get Book Info
        System.out.println(book1.getBookInfo());

//    borrowing book
        book1.borrowBook();

//    returning book
        book1.returnBook();
    }
}