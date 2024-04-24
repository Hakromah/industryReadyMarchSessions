package opps.finalkeyword;

class AutoMobile1 {
	final int num = 140;
	final double grade;// it should be assigned in the constructor

	final public void engineInfo() {
		//num = 150; final cannot be re-assigned
		System.out.println("Logic which has generic details about engine");
	}

	AutoMobile1() {
		grade = 100;
	}
}
//==> Final class cannot be inherited.
//--> Final methods can be applied in inheritance if parent class is not final.
//--> Final method cannot be overridden.
//--> Final variables cannot be re-assigned (it will behave like a constant variable the value cannot be changed)

//==> 'abstract class' can never be 'final'.
//--> An abstract method can also never be *final* bcz, abstract methods need to be overridden but
//--> final keyword will restrict overriding

class Bike extends AutoMobile1 {

}


public class LunchFinalKw1 {
	public static void main(String[] args) {
		AutoMobile1 auto = new AutoMobile1();
		AutoMobile1 bike = new Bike();


		auto.engineInfo();
	}
}
