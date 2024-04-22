package opps.polymorphisms;

class AeroPlane1 {

    public void takeOff() {
        System.out.println("AeroPlane1 is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane1 is flying");
    }
}

class CargoPlane1 extends AeroPlane1 {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway to takeOff");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}

class FighterPlane extends AeroPlane1 {
    public void takeOff() {
        System.out.println("FighterPlane requires shorter runway to takeOff");
    }

    public void fly() {
        System.out.println("FighterPlane flies at high height");
    }
}

public class LunchPolym1 {

    public static void main(String[] args) {

        CargoPlane1 cp = new CargoPlane1();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();

        fp.takeOff();
        fp.fly();
    }
}
