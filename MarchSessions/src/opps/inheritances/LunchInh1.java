package opps.inheritances;

class Alpha{
	void display(){
		System.out.println("From Alpha class");
	}
}
class Tango extends Beta{
	void tang(){
		System.out.println("From tango class");
	}
}

class Beta extends Alpha{

}



public class LunchInh1 {
	public static void main(String[] args) {
		Beta beta = new Beta();
		beta.display();

		Tango tango = new Tango();
		tango.display();

	}
}
