import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {

        if (a > 20 || b > 20) {
            return a + b;
        } else if (a < 5 && b < 5) {
            return b - a;
        } else {
            return a * b;
        }
    }
}

public class BasicCalculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(STR."Result: \{calc.add(a, b)}");
    }
}
