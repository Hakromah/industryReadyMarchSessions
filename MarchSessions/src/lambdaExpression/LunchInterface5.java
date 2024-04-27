package lambdaExpression;

interface Beta1 {
    void show();
}

// implementing interface as an anonymous inner class
// this approach is better if you are going to use  implementation multiple times.
class Demo22 implements Beta1 {
    public void show() {
        System.out.println("Implementation of show()");
    }
}

public class LunchInterface5 {
    public static void main(String[] args) {

        //Anonymous Inner class
        // this approach is better if you are going to use implementation only one.
        Beta1 beta1 = new Beta1() {

            public void show() {
                System.out.println("Implementation of show()");
            }
        };
        beta1.show();

        Demo22 d2 = new Demo22();
        d2.show();
    }
}
