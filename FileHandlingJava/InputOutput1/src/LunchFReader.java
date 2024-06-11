import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LunchFReader {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\pc\\IO\\FileHandling";
		FileReader fr = null;
		try {
			//File file = new File(path1);
			File dir = new File(path1);
			File file = new File(dir, "java.txt");
			fr = new FileReader(file);
//			int i = fr.read();
//			while (i != -1) {
//				System.out.println(i + " --> " + (char) i);
//				i = fr.read();
//			}
			// OR
			int size = (int) file.length();
			char[] ch = new char[size];
			fr.read(ch);

			for (char c : ch) {
				System.out.println(c);
			}


		} catch (Exception e) {
			System.out.println("Something went wrong! " + e);
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
