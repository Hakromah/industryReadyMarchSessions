import java.io.*;

public class LunchBufferWFileWriter {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\pc\\IO\\FileHandling";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//File file = new File(path1);
			File dir = new File(path1);
			File file = new File(dir, "java.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("Alien");
			bw.newLine();
			bw.write(66);
			bw.write(" PRESTIJ");
			bw.flush();// to make everything clean

			System.out.println("Kindly check file in the specified location to see outcome");
		} catch (Exception e) {
			System.out.println("Something went wrong! " + e);
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
