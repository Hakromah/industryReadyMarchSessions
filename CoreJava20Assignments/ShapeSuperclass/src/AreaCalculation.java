import java.awt.*;

class Shape {
	private double length;
	private double width;
	private double radius;
	private double PI = 3.14;

	public Shape(double length, double width, double radius, double PI) {
		this.length = length;
		this.width = width;
		this.radius = radius;
		this.PI = PI;
	}

	public void rectangleArea() {
		System.out.println("Rectangle Area: " + length * width);
	}

	public void circleArea() {
		System.out.println("Circle Area: " + PI * radius * radius);
	}

	public void perimeterOfRectangle() {
		System.out.println("Perimeter of Rectangle: " + 2 * (length + width));
	}

	public void perimeterOfCircle() {
		System.out.println("Perimeter of Circle: " + 2 * PI * radius);
	}

}



class Circle extends Shape {

	public Circle(double length, double width, double radius, double PI) {
		super(length, width, radius, PI);
	}
}



public class AreaCalculation {
	public static void main(String[] args) {

	}
}
