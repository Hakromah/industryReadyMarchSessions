import java.awt.*;

abstract class Shape {

    // Calculation of area
    public abstract double calculateArea();

    //Calculation of Perimeter
    public abstract double calculatePerimeter();
}

//Circle Class
class Circle extends Shape {
    private double radius;
    private double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

//Rectangle class
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

//
public class AreaCalculation {
    public static void main(String[] args) {

        Shape trg = new Rectangle(50, 30);
        Shape circle = new Circle(85);


        double triangle = trg.calculateArea();
        System.out.println("Triangle Measurements");
        System.out.println("Area: " + triangle);

        double perimeter = trg.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
        System.out.println("♦".repeat(30) + " ");

        System.out.println("Circle Area & Perimeter:");
        double area = circle.calculateArea();
        System.out.println("Area: " + area);

        double perim = circle.calculatePerimeter();
        System.out.println("Perimeter: " + perim);


    }
}
