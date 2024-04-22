package opps.inheritances.accessmodifiers;

class Parent {
    public void eat() {
        System.out.println("Parent eat usually");
    }

    protected void cry() {
        System.out.println("Parent cry silently");
    }

    public double height() {
        System.out.println("Logical to calculate height of parents");
        return 5.10;
    }
}

class Child extends Parent {
    public void eat() {
        System.out.println("Children takes lot of time to eat");
    }

    public void cry() {
        System.out.println("Children cry a lot");
    }
}

public class LunchAccess1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.cry();
        child.eat();
        child.height();
    }
}
