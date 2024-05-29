

class Alpha {
    static int a;

    static {
        System.out.println("Static Block of Alpha");
        a = 10;
        System.out.println(a);
    }

    static void display(){
        System.out.println("Static method of Alpha");
    }
}

public class LunchStatic2 {
    public static void main(String[] args) {
        Alpha.display();
        System.out.println("Main method");
    }
}
