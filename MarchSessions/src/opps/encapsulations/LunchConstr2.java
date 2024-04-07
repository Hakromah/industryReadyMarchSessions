package opps.encapsulations;

class Demo1 {
    int age;
    double salary;

    public Demo1() {
    }

    public Demo1(int x, double y) {
        this.age = x;
        this.salary = y;
    }

    public int getX() {
        return age;
    }

    public double getY() {
        return salary;
    }
}

public class LunchConstr2 {
    public static void main(String[] args) {
        Demo1 d = new Demo1(12, 15.50);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }

}
