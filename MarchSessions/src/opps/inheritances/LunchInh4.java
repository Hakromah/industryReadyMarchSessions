package opps.inheritances;

class Demo1 {
    int a, b;

    Demo1() {
        System.out.println("Zero Param Constructor of Demo1 1st C");
        a = 10;
        b = 20;
    }

    Demo1(int a, int b) {
        System.out.println("Param Constructor of Demo1 2nd C");
        this.a = a;
        this.b = b;
    }
}

class Demo2 extends Demo1 {
    int x, y;

    Demo2() {
        this(1, 2);
        x = 15;
        y = 25;
        System.out.println("Zero Param Constructor Demo2 1rst C");
    }

    Demo2(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Param Constructor Demo2 2nd C");
    }

    void display() {
        System.out.println(a + " " + b + " " + x + " " + y);
    }
}

public class LunchInh4 {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.display();
    }
}
