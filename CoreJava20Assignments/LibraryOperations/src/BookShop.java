import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Book1 {
	private String title;
	private String author;
	private boolean isCheckedOut;

	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
		this.isCheckedOut = false;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void checkedOut() {
		isCheckedOut = true;
	}

	public void returnBook() {
		isCheckedOut = false;
	}

	@Override
	public String toString() {
		return title + " by " + author + (isCheckedOut ? " (Checked out)" : " (Available)");
	}
}

class BookShopApp {
	private List<Book1> books;

	public BookShopApp() {
		books = new ArrayList<>();
	}

	// Add book
	public void addBook(Book1 book) {
		books.add(book);
		System.out.println("Book added: " + book);
	}

	//Book check out
	public void checkOutBook(String title) {
		for (Book1 book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
				book.checkedOut();
				return;
			}
			System.out.println("Checked Out successfully : " + book);
		}
		System.out.println(title + " Is not Available");
	}

	//Return the Book back
	public void returnBook(String title) {
		for (Book1 book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
				book.returnBook();
				System.out.println(book + " Is Returned, see you next time.");
				return;
			}
		}
		System.out.println(title + " Book not found or not checked out.");
	}

	//REMOVE THE BOOK FROM THE LIST
	public void removeBook(String title) {
		Iterator<Book1> bookIterator = books.iterator();
		while (bookIterator.hasNext()) {
			Book1 book = bookIterator.next();
			if (book.getTitle().equalsIgnoreCase(title)) {
				bookIterator.remove();
				System.out.println("You have successfully removed \"" + book.getTitle() + "\" from the Library");
				return;
			}
		}
		System.out.println("Sorry book \"" + title + " \"" + " Is not available in the Library");
	}

	//Display the Available Books
	public void displayAvBooks() {
		System.out.println("List of Available Books:");
		for (Book1 book : books) {
			if (!book.isCheckedOut()) {
				System.out.println(book);
			}
		}
	}
}


public class BookShop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookShopApp booksp = new BookShopApp();

		while (true) {
			System.out.println("\nBookSHOP MENU:");
			System.out.println("1 -> Add Book");
			System.out.println("2 -> Check Out Book");
			System.out.println("3 -> Return Book");
			System.out.println("4 -> Remove Book");
			System.out.println("5 -> Display Available Books");
			System.out.println("6 -> Exit");
			System.out.print("Choose an option: ");

			int select = scan.nextInt();
			scan.nextLine();

			String title;
			switch (select) {
				case 1:
					System.out.println("Enter the book title to Add");
					title = scan.nextLine();
					System.out.println("Enter the Author name");
					String author = scan.nextLine();
					booksp.addBook(new Book1(title, author));
					break;
				case 2:
					System.out.println("Check out the book:");
					String titleCheckOut = scan.nextLine();
					booksp.checkOutBook(titleCheckOut);
					break;
				case 3:
					System.out.println("Enter Book Title To Return");
					String titleReturn = scan.nextLine();
					booksp.returnBook(titleReturn);
					break;
				case 4:
					System.out.println("Enter Book title to Remove");
					String titleRemove = scan.nextLine();
					booksp.removeBook(titleRemove);
					break;
				case 5:
					booksp.displayAvBooks();
					break;
				case 6:
					System.out.println("Good bye!");
					scan.close();
					return;
				default:
					System.out.println("Invalid option please try again");
			}
		}
	}
}
