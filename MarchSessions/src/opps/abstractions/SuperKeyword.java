package opps.abstractions;

class Animals {
	void eat() {
		System.out.println("eating...");
	}

	Animals() {
		// this parent constructor will be invoked by super()
		// automatically if there is no super() or this().
		System.out.println("Animal is created... by super() behind the seen");
	}
}

class Dog1 extends Animals {
	void eat() {
		System.out.println("eating bread..");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}
// REAL USE OF super()
class Person{
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	public Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void display(){
		System.out.println(id +" "+name+ " "+salary);
	}

}

public class SuperKeyword {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.work();

		Emp emp = new Emp(1,"Hawa",150052f);
		emp.display();

	}
}
