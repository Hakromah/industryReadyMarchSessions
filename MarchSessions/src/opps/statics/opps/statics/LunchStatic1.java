package opps.statics;

public class LunchStatic1 {

    static int a;

    static {
        System.out.println("Static Block");
        a = 10;
    }

    public static void main(String[] args) {
       System.out.println(a);
    }
}
