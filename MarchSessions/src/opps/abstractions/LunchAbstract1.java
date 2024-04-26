package opps.abstractions;

abstract class Animal1 {

	abstract Integer multiply(int n1, int num2);

	abstract int subtract(double n, double n2);


}

class Dog extends Animal1 {

	//instance initializer block, It runs each time when object of the class is created.
	//  Instance initializer block is invoked at the time of object creation
	{
		System.out.println("Instance initializer block invoked");
	}

	@Override
	Integer multiply(int n1, int num2) {

		return n1 * num2;
	}

	@Override
	int subtract(double n, double n2) {

		System.out.println("from the abstract class");
		return (int) (n - n2);
	}
}

public class LunchAbstract1 {
	public static void main(String[] args) {
		Dog b = new Dog();
		System.out.println(b.subtract(50, 10));
		;
		System.out.println(b.multiply(5, 90));
	}

	// An abstract class can be extended but cannot be instantiated.
	// abstract methods within abstract class, has no implementation / body.
	// If a concrete class (non-abstract) extends an abstract class, it should implement all abstract methods -
	// or the concrete methode should be declared as an abstract class as well.

	//==> "Abstract" can have both concrete and non-concrete methods.
	//==> "Interface" can only have non-concrete methods.
}
