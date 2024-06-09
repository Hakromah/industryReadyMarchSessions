package objectLSynchro;

public class Atm extends Thread {
	// we extend Atm class from Thread class that means if you create object of
	// Atm class then it will be a thread created.

	private UBABank uba;// this is association Approach

	public Atm(UBABank uba) {
		this.uba = uba;
	}

	public void run() {
		// UBABank b = new UBABank(0); // this is composition.
		// b.withdrawal(4000);
		// As all the Three classes will use the same ubaBank object, we can use loose
		// coupling mechanism.
		
		System.out.println("Withdrawal");
		uba.withdrawal(6000);

	}
}
