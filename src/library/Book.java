package library;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    // Getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable =  isAvailable;
    }

    //Borrow Book

    public void borrowBook(){
        System.out.println("\nBorrowing the book...");
        if(this.isAvailable){
            System.out.println("Borrowed successfully!");
            this.isAvailable = false;
        }else{
            System.out.println("Book is already borrowed");
        }
        System.out.println("Availability after borrowing: " + this.isAvailable());
    }

//    Return Book

    public void returnBook(){
        System.out.println("\nReturning the book...");
        if(!this.isAvailable){
            this.isAvailable = true;
            System.out.println("Returned successfully!");
        }
        System.out.println("Availability after returning: " + this.isAvailable());
    }

//    Get Book Info
    public String getBookInfo(){
        return  "\nTitle : \"" + this.title + '\"' + '\n' +
                "Author : \"" + this.author + '\"' + '\n' +
                "Availability : " + this.isAvailable ;
    }
}