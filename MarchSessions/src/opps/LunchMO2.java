package opps;


class Calc2 {
    double add(double x, int y) {
        return x + y;
    }

    double add(int x, double y) {
        return x + y;
    }
}

public class LunchMO2 {
    public static void main(String[] args) {
        Calc2 c2 = new Calc2();
        double n = c2.add(2.2, 10);
        System.out.println(n);
    }
}
