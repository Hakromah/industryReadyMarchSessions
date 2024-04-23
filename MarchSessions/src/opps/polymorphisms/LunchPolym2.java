package opps.polymorphisms;


class Animal {
    public void eat() {
        System.out.println("Animal eats a lot");
    }
}

class Tiger1 extends Animal {
    public void eat() {
        System.out.println("Tiger hunts and eats a lot");
    }
}

class Monkey extends Animal {
    public void eat() {
        System.out.println("Monkey steals  and eats a lot");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer grazes eats a lot");
    }
}

class Forest {
    public void permit(Animal ref) {
        //we achieve runtime polymorphism create Parent type ref variable for child objects
        // and method Overridden
        ref.eat();
    }
}

public class LunchPolym2 {
    public static void main(String[] args) {
        Tiger1 t1 = new Tiger1();
        Monkey m = new Monkey();
        Deer d = new Deer();

        Forest f = new Forest();
        f.permit(t1);
        f.permit(m);
        f.permit(d);

    }
}
