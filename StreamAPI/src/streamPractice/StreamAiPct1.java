package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}

public class StreamAiPct1 {
	public static void main(String[] args) {

		List<Student> stud = new ArrayList<>();
		stud.add(new Student(1, "Ram", 23));
		stud.add(new Student(2, "Shyam", 24));
		stud.add(new Student(3, "Aman", 25));
		stud.add(new Student(4, "Sita", 26));

		stud.stream().
				filter(s -> s.age > 23 && s.name.startsWith("S"))
				.forEach(s -> System.out.println(s));




		//		Student s1 = new Student(1, "Ram", 23);
//		Student s2 = new Student(2, "Shyam", 24);
//		Student s3 = new Student(3, "Aman", 25);
//		Student s4 = new Student(4, "Sita", 26);

//		Stream<Student> stream = Stream.of(s1, s2, s3, s4);
//		stream.filter(student -> student.age > 23 && student.name.startsWith("S"))
//				.forEach(student -> System.out.println(student));


	}
}
