interface Shape {
	void area();

	void perimeter();

}

class Square implements Shape {
	private double a;

	public Square(double a) {
		this.a = a;
	}

	@Override
	public void area() {

		double area = a * a;
		System.out.println("Area: " + area);
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter: " + (4 * a));
	}
}

class Triangle implements Shape {
	private double h, b, a, c;


	public Triangle(double height, double b, double a, double c) {
		this.h = height;
		this.b = b;
		this.a = a;
		this.c = c;
	}

	@Override
	public void area() {

		double area = (double) 1 / 2 * (b * h);
		System.out.println("Area: " + area);
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter: " + (a + b + c));
	}
}


public class CalculateShapeFromInterface {
	public static void main(String[] args) {
		Shape square = new Square(4);
		Shape triangle = new Triangle(10, 4, 9, 15);

		System.out.println("Square details:");
		square.area();
		square.perimeter();
		System.out.println("•".repeat(30));

		System.out.println("Triangle display:");
		triangle.area();
		triangle.perimeter();


	}
}
