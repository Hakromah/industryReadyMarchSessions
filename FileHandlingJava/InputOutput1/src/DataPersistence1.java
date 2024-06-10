import java.io.File;

public class DataPersistence1 {
	public static void main(String[] args) {
		/*
		==> JavaApp => JVM => JRE => RAM
		Data Persistence
		1. File System => HDD => IO | File handling
		2. Database =>JDBC
		3. Network
		4. Cloud
		5. Memory
		* */
		String path1 = "C:\\Users\\pc\\IO\\FileHandling\\java.txt";
		String path2 = "C:\\Users\\pc\\IO\\telusko";
		File file1 = new File(path1);
		try {
			//System.out.println(file1.createNewFile());// if file exists, it will not create duplicate file
			System.out.println(file1.exists());//false// true
			System.out.println(file1.isFile());
			System.out.println(file1.isDirectory());
			System.out.println(file1.getPath());

			File directory = new File(path2);
			System.out.println(directory.mkdir());
			System.out.println("*".repeat(30));

			File file2 = new File("C:\\Users\\pc\\IO\\src\\teluskojava.txt");
			System.out.println(file2.createNewFile());
			String[] str = file1.list();
			int count = 0;
			for (String files : str) {
				count++;
				System.out.println(files);
			}
			System.out.println("Number of files in the specified path :" + count);


		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
