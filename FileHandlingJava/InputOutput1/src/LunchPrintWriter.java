import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LunchPrintWriter {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\pc\\IO\\FileHandling";

		File dir = new File(path1);
		File file = new File(dir, "java.txt");

		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println(true);
			pw.println(55);
			pw.println(64.5);
			pw.println("Holiday");
			pw.println('A');

			pw.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}
}
