package objectSynchro;

import java.text.NumberFormat;

public class UBABank {
    int accountBal;

    public UBABank(int accountBal) {
        this.accountBal = accountBal;
    }

    synchronized public void withdrawal(int withdrawalAmt) {
        accountBal = this.accountBal - withdrawalAmt;
        //accountBal -= withdrawalAmt;
    }

    synchronized public void deposit(int depositAmt) {
        accountBal = this.accountBal + depositAmt;
        //accountBal += depositAmt;
    }

    synchronized public void showBalance() {
        System.out.println("Balance is : " + NumberFormat.getCurrencyInstance().format(accountBal));
    }
}
