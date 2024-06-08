interface Shape1 {
	double area1();

	double perimeter1();
}

class Square1 implements Shape1 {
	private double side;

	public Square1(double side) {
		this.side = side;
	}

	@Override
	public double area1() {
		return side * side;
	}

	@Override
	public double perimeter1() {
		return 4 * side;
	}
}

class Triangle1 implements Shape1 {
	private double side;

	public Triangle1(double side) {
		this.side = side;
	}

	@Override
	public double area1() {
		return (Math.sqrt(3) / 4) * side * side;
	}

	@Override
	public double perimeter1() {
		return 3 * side;
	}
}


public class Calculation2 {

	public static void main(String[] args) {

		Shape1 square1 = new Square1(4);
		Shape1 rectangle1 = new Triangle1(10);

		System.out.println(square1.area1());
		System.out.println(square1.perimeter1());
		System.out.println("\n");
		System.out.println(rectangle1.area1());
		System.out.println(rectangle1.perimeter1());
	}

}
