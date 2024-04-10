package opps.statics;

class Demo {
    //static variable memory will be allocated during the class loading in the heap area.
    static int x, y;
    int a, b;

    //static block also will be executed during the class loading itself
    static {
        x = 10;
        y = 20;
        System.out.println("Static block");
    }

    // Java block will be executed when you create Object before the body of the constructor
    {
        a = 100;
        b = 300;
        System.out.println("Java initialization block(non static block)");
    }

    Demo() {
        System.out.println("Zero param constructor");
    }

    // static method can be invoked directly with the class name
    static void display() {
        System.out.println(x);
        System.out.println(y);
    }

    void show() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class LunchStatic3 {
    public static void main(String[] args) {
        Demo.display();
        Demo d = new Demo();
        d.show();
    }
}
