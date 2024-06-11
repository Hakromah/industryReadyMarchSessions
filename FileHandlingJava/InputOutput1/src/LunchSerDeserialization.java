import java.io.*;
import java.text.NumberFormat;

class Employee implements Serializable {
	//private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	transient private double salary;// transient will exclude the variable from Serialization

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary : " + NumberFormat.getCurrencyInstance().format(salary));
	}
}

public class LunchSerDeserialization {
	public static void main(String[] args) {

		//let create Employee object
//		Employee emp = new Employee(101, "Mathew", 12600);
//		emp.display();


		// we want to Serialize (make it a bite code for networking) this Employee object
		try {
			//to make the bite code more efficient and faster, we add BufferOutputStream
//			FileOutputStream fos = new FileOutputStream("C:\\Users\\pc\\IO\\FileHandling\\java.txt");
//			BufferedOutputStream bos = new BufferedOutputStream(fos);// for efficiency
//			ObjectOutputStream oos = new ObjectOutputStream(bos);
//			oos.writeObject(emp);
//			System.out.println("Kindly check file on HD");
//			oos.close();
//			bos.close();

			// Let us Deserialize the same Employee object without creating any new obj
			FileInputStream fis = new FileInputStream("C:\\Users\\pc\\IO\\FileHandling\\java.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			Employee em = (Employee) ois.readObject();
			em.display();

			ois.close();
			bis.close();
		} catch (Exception e) {
			System.out.println("Something went wrong!" + e);
		}
	}
}
