package interfaces;

interface Calculator {
	double pi = 3.14; // public static and final
	int mul();
	int div();

}

interface Calculator2 extends Calculator {
	int add(); // public and abstract
	int sub();
}

class Cal implements Calculator2 {

	@Override
	public int add() {
		return 50 + 10;
	}

	@Override
	public int sub() {
		return 100 - 85;
	}

	@Override
	public int mul() {
		return 50 * 2;
	}

	@Override
	public int div() {
		return 50 / 3;
	}
}

public class LunchInterface2 {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.add();
		c.div();
		c.mul();
		c.sub();

		System.out.println(Calculator.pi);
	}
}
