class Shape1 {
	double length;
	double width;
	double radius;
	double PI = 3.14;


	public double area() {
		return 0;
	}

	public double perimeter() {
		return 0;
	}
}

class Rectangle1 extends Shape1 {
//	private double length;
//	private double width;

	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}
}

class Circle1 extends Shape1 {
//	private double radius;
//	private double PI = 3.14;

	public Circle1(double radius) {
		this.radius = radius;
	}

	public double area() {
		return PI * (radius * radius);
	}

	public double perimeter() {
		return 2 * PI * radius;
	}

}

public class SuperclassAreaCalculation {
	public static void main(String[] args) {
		Shape1 rectangle = new Rectangle1(40, 24);
		Shape1 circle = new Circle1(7);

		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter() + " \n");

		System.out.println("♦".repeat(30));

		System.out.println("Circle Calculations:");
		System.out.println("Area: " + circle.area());
		System.out.println("Perimeter: " + circle.perimeter());


	}
}
