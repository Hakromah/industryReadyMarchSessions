package opps.polymorphisms;

abstract class AeroPlane1 {
    public abstract void takeOff();

    int name;

    public abstract void fly();
    //==> In Java, we can have method without body/implementation but that method must be an 'abstract' method.
    //==> If one method is 'abstract' in a class, then that class must be declared as 'abstract' class
    //==> Abstract class can have both concrete & abstract methods.
    //==> Abstract class can not be instantiated i.e, we cannot crate an Obj of abstract class.
    //==> A 'variable' can never be abstract
    //==> An 'abstract class' can have a Constructor and, it gets executed  bcz, of super() call present in child class Constructor
    //==> 'Constructor' can never be abstract bcz, they have super() call & they can't be inherited or Overridden.

    //==> method overriding --> Compile time polymorphism.
    //==> method overloading --> Runtime polymorphism.


    public AeroPlane1() {
        System.out.println("Constructor in Abstract class");
    }

    public void sleep() {
        System.out.println("Animal needs to sleep");
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

class Airport {
    public void permit(AeroPlane1 ref) {
        ref.takeOff();
        ref.fly();
        ref.sleep();
        // 1 to many polymorphism
    }
}

public class LunchPolym1 {

    public static void main(String[] args) {

        CargoPlane1 cp = new CargoPlane1();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);

//        AeroPlane1 ref;
//        ref = cp; // Aeroplane1 ref = new CargoPlane1() it means ref has the obj of CargoPlane.
//        ref.takeOff();
//        ref.fly();
//
//        ref = fp; // Aeroplane1 ref = new FighterPlane()
//        ref.takeOff();
//        ref.fly();
    }
}
