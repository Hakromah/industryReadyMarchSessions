class Person {
	private String name;
	private int age;
	private int id;

	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
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
		if (age > 0) {
			this.age = age;
		}else {
			System.out.println("Age cannot be Negative!!");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class PersonApp {
	public static void main(String[] args) {
		// Create Person Object
		Person person = new Person("Ahmet",25,15326);

		// Let get and modify the attributes
		System.out.println("Name: "+ person.getName());
		System.out.println("Age: "+ person.getAge());
		System.out.println("ID: "+ person.getId());


		System.out.println("♠".repeat(25));
		System.out.println("♦".repeat(25));

		// Let Modify the attributes
		person.setName("PAOLO");
		person.setAge(45);
		person.setId(45252);

		// Let print the modified attributes
		System.out.println("Updated Name: "+ person.getName());
		System.out.println("Updated Age: "+person.getAge());
		System.out.println("Updated ID: "+person.getId());


	}
}
