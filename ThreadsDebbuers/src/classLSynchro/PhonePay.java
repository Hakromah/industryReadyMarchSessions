package classLSynchro;

public class PhonePay extends Thread {

    private UBABank uba; // association approach

    public PhonePay(UBABank uba) {
        this.uba = uba;
    }

    public void run() {
    	//class level synchronization
        uba.showBalance();

    }
}
