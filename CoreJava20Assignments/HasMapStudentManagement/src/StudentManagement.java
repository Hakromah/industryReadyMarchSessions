import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name;
	private int age;
	private int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
}

class StudManagement {
	HashMap<Integer, Student> studentMap;

	public StudManagement() {
		studentMap = new HashMap<>();
	}

	// add student
	public void addStudent(int id, Student student) {
		studentMap.put(id, student);
		System.out.println("Student added successfully");
	}

	// remove student
	public void removeStudent(int id) {
		if (studentMap.containsKey(id)) {
			studentMap.remove(id);
			System.out.println("Student removed successfully");
		}else {
			System.out.println("Student not found");
		}
	}

	// display student
	public void displayStudent(int id) {
		if (studentMap.containsKey(id)) {
			System.out.println(studentMap.get(id));
		}else {
			System.out.println("Student not found");
		}
	}
	// update student
	public void updateStudent(int id, Student student) {
		if (studentMap.containsKey(id)) {
			studentMap.put(id, student);
			System.out.println("Student updated successfully");
		}else {
			System.out.println("Student not found");
		}
	}
}


public class StudentManagement {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		StudManagement studManagement = new StudManagement();
		while(true) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to remove student");
			System.out.println("Enter 3 to display student");
			System.out.println("Enter 4 to update student");
			System.out.println("Enter 5 to exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter student id");
				int id = scan.nextInt();
				System.out.println("Enter student name");
				String name = scan.next();
				System.out.println("Enter student age");
				int age = scan.nextInt();
				System.out.println("Enter student grade");
				int grade = scan.nextInt();

				Student student = new Student(name, age, grade);
				studManagement.addStudent(id, student);
				break;
			case 2:
				System.out.println("Enter student id");
				id = scan.nextInt();
				studManagement.removeStudent(id);
				break;
			case 3:
				System.out.println("Enter student id");
				id = scan.nextInt();
				studManagement.displayStudent(id);
				break;
			case 4:
				System.out.println("Enter student id");
				id = scan.nextInt();
				System.out.println("Enter student name");
				name = scan.next();
				System.out.println("Enter student age");
				age = scan.nextInt();
				System.out.println("Enter student grade");
				grade = scan.nextInt();
				student = new Student(name, age, grade);
				studManagement.updateStudent(id, student);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}
}
