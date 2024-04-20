package opps.inheritances;

class Animal {
    protected int age;

    void eat() {
        System.out.println("Animal eats a lot");
        System.out.println("_".repeat(30));
    }
}

class Tiger extends Animal {
    void eat() {
        age = 10;
        System.out.println("Tiger hunts and eats and age is " + age);
    }
}

class Cat extends Tiger{

}

public class LunchInh3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal tiger = new Tiger();
        tiger.eat();

        Cat cat = new Cat();
        cat.eat(); // Multilevel inheritance "is getting method from grandparent"
    }
}
