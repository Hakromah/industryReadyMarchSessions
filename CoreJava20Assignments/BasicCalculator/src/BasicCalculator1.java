import java.util.Scanner;

public class BasicCalculator1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter The Second Number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter The Operation: ");
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.println(STR."Sum = \{num1}\{num2}");
            case '-' -> System.out.println(STR."Difference = \{num1 - num2}");
            case '*' -> System.out.println(STR."Product = \{num1 * num2}");
            case '/' -> {
                System.out.println(STR."Quotient = \{num1 / num2}");
                try {
                    if (num2 == 0) {
                        throw new ArithmeticException();
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                    // how can I give the user to enter another second number and operation?
//                    System.out.println("Enter The Second Number: ");
//                    num2 = scan.nextDouble();
//                    System.out.println("Enter The Operation: ");
//                    operation = scan.next().charAt(0);
//                    switch (operation) {
//                        case '+' -> System.out.println(STR."Sum = \{num1}\{num2}");
//                        case '-' -> System.out.println(STR."Difference = \{num1 - num2}");
//                        case '*' -> System.out.println(STR."Product = \{num1 * num2}");
//                        case '%' -> System.out.println(STR."Remainder = \{num1 % num2}");
//                        case '/' -> {
//                            if (num2 == 0) {
//                                System.out.println("Cannot divide by zero");
//                            }
//                            System.out.println(STR."Quotient = \{num1 / num2}");
//                        }
//                    }
                }

//                if (num2 == 0) {
//                    System.out.println("Cannot divide by zero");
//                }
            }
            case '%' -> System.out.println(STR."Remainder = \{num1 % num2}");
            default -> System.out.println("Invalid Operation");
        }

    }
}
