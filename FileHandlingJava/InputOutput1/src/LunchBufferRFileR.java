import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LunchBufferRFileR {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\pc\\IO\\FileHandling";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//File file = new File(path1);
			File dir = new File(path1);
			File file = new File(dir, "java.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str = br.readLine();

			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}


		} catch (Exception e) {
			System.out.println("Something went wrong! " + e);
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}