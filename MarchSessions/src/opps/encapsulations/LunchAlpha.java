package opps.encapsulations;

class Alpha {
    int a, b;

    public Alpha() {

        this(44);
        System.out.println("Zero parameterized constructor");
        a = 10;
        b = 20;
    }

    public Alpha(int j) {
        System.out.println("1 parameterized constructor");
        a = j;
    }

    public Alpha(int x, int y) {
        this();
        System.out.println("2 parameterized constructor");
        this.a = x;
        this.b = y;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class LunchAlpha {
    public static void main(String[] args) {
        Alpha alpha1 = new Alpha();
        alpha1.display();

        Alpha alpha2 = new Alpha(4,6);
        alpha2.display();
    }
}
