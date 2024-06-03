import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Books {

    private final String title;
    private boolean checkedOut;

    public Books(String title) {
        this.title = title;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

class Library {

    private List<Books> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void checkoutBook(String title) {
        for (Books book : books) {
            if (book.getTitle().equals(title)) {
                book.setCheckedOut(true);
                break;
            }
        }
    }

    public void returnBook(String title) {
        for (Books book : books) {
            if (book.getTitle().equals(title)) {
                book.setCheckedOut(false);
                break;
            }
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Books book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getTitle());
            }
        }
        System.out.println("*".repeat(20));
    }
}


public class BookStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Library library = new Library();
        library.addBook(new Books("Student Companion"));
        library.addBook(new Books("Liberian History"));
        library.addBook(new Books("Maths1"));
        library.addBook(new Books("Example Java"));


        library.checkoutBook("Maths1");
        library.displayAvailableBooks();
        library.returnBook("Maths1");
        library.displayAvailableBooks();
    }
}
