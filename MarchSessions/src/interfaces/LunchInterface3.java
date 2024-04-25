package interfaces;

interface Alpha{
	//Marker interface has nobody
	//==> abstract vs Interface <==\\
	//--> In an Interface all methods are public & abstract by default.
	//--> In a class we must explicitly define public & abstract if we need them.
	//--> In an Interface all variables are public, static & final.
	//--> In a class we must specify public, static & final if needed.
	//--> A class can extends only one class
	//--> a class can extends 1 class and multiple interfaces at the same time.

	//==> In interface now we can have method with body/implementation in Java 8+
	//==> default method of an interface will get inherited in all implementation classes but, it's not compulsory to be overridden
	//==> we can all have static method with implementation/body in an interface but, it cannot be inherited in the implementing classes
	//-> but it can be invoked using interface name.
}
interface Calc1 {
	int add();

	int sub();
}

interface Calc2 {
	int mul();

	int div();
}

class MyCalc2 {
	void total() {
		System.out.println("Here is the total result");
	}
}

class MyCalculator extends MyCalc2 implements Calc1, Calc2 {

	public int add() {
		return 1 + 2;
	}

	public int sub() {
		return 6 - 5;
	}

	public int mul() {
		return 9 * 9;
	}

	public int div() {
		return 6 / 2;
	}
}

public class LunchInterface3 {
	public static void main(String[] args) {
		MyCalculator myCalc = new MyCalculator();
		myCalc.add();
		myCalc.div();
		myCalc.sub();
		myCalc.mul();
		myCalc.total();
	}
}
