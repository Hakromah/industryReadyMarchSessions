

class Beta {
    static int a; //static variable memory will be allocated during the class loading in the heap area.

    static {
        a = 10;
        System.out.println("Static initialization block");
    }

    // static method can be called directly with the class name
    // Beta.display()
    // can also be called with the class Object
    //Beta b = new Beta()
    // b.display()
    static void display() {
        System.out.println(a);
    }
}

public class LunchStatic4 {
    public static void main(String[] args) {
        Beta.display();
        Beta b = new Beta();
        b.display();
    }
}
