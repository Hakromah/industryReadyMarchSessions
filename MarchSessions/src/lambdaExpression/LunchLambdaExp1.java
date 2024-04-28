package lambdaExpression;

interface Alpha11 {
    // if interface has a single abstract method, it is called "functional interface" 'SAM'
    void show();
}

// #1 to implement SAM interface
class Demo1 implements Alpha11 {
    @Override
    public void show() {

    }
}


public class LunchLambdaExp1 {
    public static void main(String[] args) {

        // #2 to implement functional interface (Single Abstract Method) == SAM
        Alpha11 a1 = new Alpha11() {
            @Override
            public void show() {

            }
        };
        a1.show();

        //Lambda Expression implements a functional interface that is (SAM) Single Abstract Method
        Alpha11 alpha11 = () -> System.out.println("Functional Interface call by Lambda Exp");
        alpha11.show();
    }
}
