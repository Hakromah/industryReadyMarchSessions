package opps.statics;


class Gamma {

    static int count;

    {
        count++;

    }

    public Gamma() {
    }

    public Gamma(int a) {

    }

    public Gamma(int a, int y) {
    }
}

public class LunchStatic5 {

    public static void main(String[] args) {
        Gamma g1 = new Gamma();
        System.out.println(Gamma.count);
        Gamma g2 = new Gamma(1);
        System.out.println(Gamma.count);
        Gamma g3 = new Gamma(5, 6);
        System.out.println(Gamma.count);
    }
}

