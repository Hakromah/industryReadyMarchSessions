package app;

class A {
	public void display() {
		System.out.println("Display from A class");
	}
}

// method will create type coupling as you are extending A to B
// If A get a problem, automatically B will also have problem
// which means 1 class is type bonded to another class

class B extends A {
	public void show() {
		System.out.println("Show from B class");

		// direct call
		display();

		// Or creating A class object
		A a = new A();
		a.display();
	}
}

// If we can call the A class method inside B class without extending B to A,
// And without creating A object, we call this "looseCoupling"

public class LunchApp {
}
