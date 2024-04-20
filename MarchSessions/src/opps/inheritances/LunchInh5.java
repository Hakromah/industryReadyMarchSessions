package opps.inheritances;

class Alpha1 {
    int a, b;

    public Alpha1() {
        System.out.println("Zero Param Constructor Alpha - P");
        a = 1;
        b = 2;
    }

    public Alpha1(int a, int b) {
        System.out.println("Param Constructor Alpha - P");
        this.a = a;
        this.b = b;
    }

}

class Beta1 extends Alpha1 {
    int c, d;

    public Beta1() {
        super(100, 200);
        c = 1;
        d = 2;
        System.out.println("Zero Param Constructor Beta - C");
    }

    public Beta1(int c, int d) {
        this();
        this.c = c;
        this.d = d;
        System.out.println("Param Constructor Beta - C");
    }

    void display() {
        System.out.println("a:" + a + " b:" + b + " c:" + c + " d:" + d);
    }
}

public class LunchInh5 {
    public static void main(String[] args) {
        Beta1 beta = new Beta1(60, 70);
        beta.display();
    }
}
