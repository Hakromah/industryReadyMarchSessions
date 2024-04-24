package opps.statics;

import java.sql.SQLOutput;

class Alpha2 {
	public static void show() {
		System.out.println("Static method in parent class");
	}
}

class Beta2 extends Alpha2 {

	//@Override

	//==> static method can be inherited but cannot be overridden
	public static void show() {
		System.out.println("Static method in child class");
	}
}

class Parent {
	void shows() {
		System.out.println("Show in parent class");
	}
}

class Child extends Parent {
	void shows() {
		System.out.println("Shows in Child class");
	}

	void display() {
		System.out.println("Display in Child claSS");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
//		Beta2 bt2 = new Beta2();
//		Alpha2 alp2 = new Alpha2();
//
//		alp2.show();
//		bt2.show();

		Parent prt = new Child(); // Up Casting
		Child child = (Child) prt;// Down Casting


		child.display();
		child.shows();
	}
}
