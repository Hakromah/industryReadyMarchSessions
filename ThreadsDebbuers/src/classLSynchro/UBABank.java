package classLSynchro;

import java.text.NumberFormat;

public class UBABank {
   static int accountBal=4000;

//    public UBABank(int accountBal) {
//        UBABank.accountBal = accountBal;
//    }

    synchronized static public void withdrawal(int withdrawalAmt) {
        accountBal = accountBal - withdrawalAmt;
        //accountBal -= withdrawalAmt;
    }

    synchronized static public void deposit(int depositAmt) {
        accountBal = accountBal + depositAmt;
        //accountBal += depositAmt;
    }

    synchronized public void showBalance() {
        System.out.println("Balance is : " + NumberFormat.getCurrencyInstance().format(accountBal));
    }
}
