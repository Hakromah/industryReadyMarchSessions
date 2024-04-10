package opps.encapsulations;
class Demo{
    int x;
    double y;

    public Demo() {
        System.out.println("Zero param constructor");
    }

    public Demo(int x, double y) {
        this();
        this.x = x;
        this.y = y;
    }
}


public class DemoThis {
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1 = new Demo(22,2.8);
        System.out.println(d);

    }
}
