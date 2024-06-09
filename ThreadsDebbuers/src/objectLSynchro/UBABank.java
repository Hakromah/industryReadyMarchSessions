package objectLSynchro;

import java.text.NumberFormat;

public class UBABank {
	int accountBal;

	public UBABank(int accountBal) {
		this.accountBal = accountBal;
	}

	synchronized public void withdrawal(int withdrawalAmt) {

		if (accountBal < withdrawalAmt) {

			try {

				wait();// is coming from the Object which is the parent for UBABank.
				//Thread.sleep(4000);
				
				// if a method is in the wait state, it will not release the lock until the thread is notified.
				//if the thread is notified while waiting, it will not wait anymore.
				
				// But if the thread is in sleep state, it will not wake up until
				// the specified time is over, even if the thread is notified.
				
				// This is the major difference between wait() and sleep().
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			accountBal = this.accountBal - withdrawalAmt;
			// accountBal -= withdrawalAmt;
		}

	}

	synchronized public void deposit(int depositAmt) {
		accountBal = this.accountBal + depositAmt;
		notifyAll();// it notifies all the waiting threads that deposit is done.
		
		// accountBal += depositAmt;
	}

	synchronized public void showBalance() {
		System.out.println("Balance is : " + NumberFormat.getCurrencyInstance().format(accountBal));
	}
}
