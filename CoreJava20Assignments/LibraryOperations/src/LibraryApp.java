import java.util.ArrayList;
import java.util.Iterator;
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

	//Check Out Book
	public void checkOutBook(String title) {
		for (Book2 book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
				book.checkOut();
				//System.out.println("Checked out: " + book);
				return;
			}
		}
		System.out.println("Book not available: " + title);
	}

	//Remove Book from the list (4)
	public void removeBook(String title) {
		Iterator<Book2> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book2 book = iterator.next();
			if (book.getTitle().equalsIgnoreCase(title)) {
				iterator.remove();
				System.out.println("You've successfully removed \"" + book.getTitle() + "\" from the library.");
				return;
			}
		}
		System.out.println("Sorry, the book \"" + title + "\" is not a part of our library.");
	}

	//Return Book
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

	//Display Available Books
	public void displayAvailableBooks() {
		System.out.println("Available books:");
		for (Book2 book : books) {
			if (!book.isCheckedOut()) {
				System.out.println(book);
			}
		}
	}
}

public class LibraryApp {
	public static void main(String[] args) {
		Library2 library = new Library2();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\nLibrary Menu:");
			System.out.println("1 -> Add Book");
			System.out.println("2 -> Check Out Book");
			System.out.println("3 -> Return Book");
			System.out.println("4 -> Remove Book");
			System.out.println("5 -> Display Available Books");
			System.out.println("6 -> Exit");
			System.out.print("Choose an option: ");
			int pick = scan.nextInt();
			scan.nextLine();  // consume newline

			String title;
			switch (pick) {
				case 1:
					System.out.print("Enter book title: ");
					title = scan.nextLine();
					System.out.print("Enter book author: ");
					String author = scan.nextLine();
					library.addBook(new Book2(title, author));
					break;
				case 2:
					System.out.print("Enter book title to check out: ");
					String titleToCheckOut = scan.nextLine();
					library.checkOutBook(titleToCheckOut);
					break;
				case 3:
					System.out.print("Enter book title to return: ");
					String titleToReturn = scan.nextLine();
					library.returnBook(titleToReturn);
					break;
				case 4:
					System.out.print("Enter the book title to remove: ");
					title = scan.nextLine();
					library.removeBook(title);
					break;
				case 5:
					library.displayAvailableBooks();
					break;
				case 6:
					System.out.println("Goodbye!");
					scan.close();
					return;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
	}
}
