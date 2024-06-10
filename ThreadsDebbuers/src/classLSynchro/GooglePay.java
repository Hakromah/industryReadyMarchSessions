package classLSynchro;

public class GooglePay extends Thread {

  

    @Override
    public void run() {
        System.out.println("Deposit");
 
        //class level synchronization
		UBABank.deposit(6000);
        
    }
}
