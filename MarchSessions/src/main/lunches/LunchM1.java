package main.lunches;

class Calculator {
    int num1, num2, res;

    void add() {
        num1 = 12;
        num2 = 3;
        res = num1 + num2;
        System.out.println("Result is " + res);
    }
}

public class LunchM1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
    }
}
