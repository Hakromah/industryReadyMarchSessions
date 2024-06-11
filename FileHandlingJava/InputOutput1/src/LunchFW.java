import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LunchFW {
	public static void main(String[] args) {

		//String path1 = "C:\\Users\\pc\\IO\\FileHandling\\java.txt";
		String path1 = "C:\\Users\\pc\\IO\\FileHandling";
		FileWriter fw = null;
		try {
			//File file = new File(path1);
			File dir = new File(path1);
			File file = new File(dir, "java.txt");
			fw = new FileWriter(file);
			fw.write("Java");
			fw.write(65);// 65 stands for A
			char[] ch = {'s', 'q', 'l'};
			fw.write(ch);// output: JavaAsql if you check in the file at CD
			System.out.println("Kindly check file in the specified location to see outcome");
		} catch (Exception e) {
			System.out.println("Something went wrong! " + e);
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
