package lambdaExpression;

@FunctionalInterface//FUNCTIONAL INTERFACE HAS ONLY ONE METHOD
interface FI {
    void display(float a);
}

public class LunchLambdaExp2 {
    public static void main(String[] args) {
        FI fi = (a) -> {
            System.out.println(a);
        };
        fi.display(15f);

        FI f2 = (System.out::println);
        f2.display(100f);
    }
}
