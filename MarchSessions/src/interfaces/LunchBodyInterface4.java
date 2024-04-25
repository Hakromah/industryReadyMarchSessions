package interfaces;

interface Alpha1 {

	void show();

	// default keyword to add body to interface method in Java 8+
	default void display() {
		System.out.println("Display of interface body in interface");
	}
}

class Beta implements Alpha1 {

	public void show() {
		System.out.println("Show implemented in beta class");
	}
	public void display(){
		System.out.println("Display of interface body in child class");
	};
}

public class LunchBodyInterface4 {
	public static void main(String[] args) {
		Alpha1 ap= new Beta();
		ap.display();
		ap.show();
	}
}
