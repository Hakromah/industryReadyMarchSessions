import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book2 {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isCheckedOut ? " (Checked Out)" : " (Available)");
    }
}
//LIBRARY CLASS
class Library2 {
    private List<Book2> books;

    public Library2() {
        books = new ArrayList<>();
    }

    public void addBook(Book2 book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void checkOutBook(String title) {
        for (Book2 book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.checkOut();
                System.out.println("Checked out: " + book);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    public void returnBook(String title) {
        for (Book2 book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.returnBook();
                System.out.println("Returned: " + book);
                return;
            }
        }
        System.out.println("Book not found or not checked out: " + title);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book2 book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }
}

public class BookShop2 {
    public static void main(String[] args) {
        Library2 library = new Library2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Check Out Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book2(title, author));
                    break;
                case 2:
                    System.out.print("Enter book title to check out: ");
                    String titleToCheckOut = scanner.nextLine();
                    library.checkOutBook(titleToCheckOut);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 4:
                    library.displayAvailableBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
