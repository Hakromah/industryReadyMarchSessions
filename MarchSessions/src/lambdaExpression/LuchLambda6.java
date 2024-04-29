package lambdaExpression;

@FunctionalInterface
interface MyCalc6 {
    int add(int a, int b);
}

public class LuchLambda6 {
    public static void main(String[] args) {
        MyCalc6 myCalc6 = (a, b) -> {
            return a + b;
        };
        System.out.println(myCalc6.add(10, 35));

        //OR
        MyCalc6 myCalc61 = (a, b) -> a + b;
        System.out.println(myCalc61.add(50, 89));

        // OR
        MyCalc6 myCalc62 = Integer::sum;
        System.out.println(myCalc62.add(100, 66));
    }
}
