package opps.inheritances;

class Ani {
	int aniAge = 30;

	void see() {
		System.out.println("See Ani Class");
	}
}

class Animal1 extends Ani{
	int age = 20;

	void show() {
		super.see();
		System.out.println("show of parent");
		System.out.println(super.aniAge);
	}
}

class Lion extends Animal1 {
	int age = 25;

	void show() {
		super.show();// to call override method as well
		System.out.println("Child age: " + age);
		System.out.println("Prent age: " + super.age);
		System.out.println("Show of Child");
	}

}

public class LunchInh6 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.show();
	}
}
