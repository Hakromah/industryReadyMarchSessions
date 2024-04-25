package interfaces;

import java.util.Scanner;

interface Calc {
	//==> Interface are collections of public and abstract methods to make 100% abstraction.
	//==> All the methods in interface, by default are public & abstract.
	//==> abstract methods don't have body/implementation
	//==> Interface give the requirements/specification other classes can make the implementation
	//==> One Interface can have any number of Implementing classes
	//==> We can create interface type reference for implementing class objects/instance to
	//-- achieve polymorphism and loos coupling
	//==> We cannot instantiate or create object of an interfaces
	//==> Interface can extend another Interface

	//==> Marker interface{} is empty interface no need implementation like Serializable
	void add();

	void sub();
}

class Mycalc implements Calc {
	Scanner scan = new Scanner(System.in);


	@Override
	public void add() {
		System.out.println("Please enter a 1st number to add:");
		int a = scan.nextInt();

		System.out.println("Please enter a 2nd number to add:");
		int b = scan.nextInt();

		int res = a + b;
		System.out.println(res);
	}

	@Override
	public void sub() {

		System.out.println("Please enter a 1st number to subtract:");
		int a = scan.nextInt();

		System.out.println("Please enter a 2nd number to subtract:");
		int b = scan.nextInt();

		int res = a - b;
		System.out.println(res);
	}

	void mul() {
		// specialised method
		double num;
		double num2;
		System.out.println("Please enter 1st number to multiply:");
		num = scan.nextDouble();
		System.out.println("Please enter 2nd number to multiply:");
		num2 = scan.nextDouble();

		double result = num * num2;
		System.out.println(result);
	}
}

public class LunchInterface1 {
	public static void main(String[] args) {
		Calc cal = new Mycalc(); // child class obj with Interface reference type
		cal.add();
		cal.sub();
		((Mycalc) cal).mul(); // down Casting parent behaves like child to get access to the Child specialised method.


	}
}
