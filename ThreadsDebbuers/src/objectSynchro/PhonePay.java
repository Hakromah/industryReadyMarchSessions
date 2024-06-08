package objectSynchro;

public class PhonePay extends Thread {

    private UBABank uba; // association approach

    public PhonePay(UBABank uba) {
        this.uba = uba;
    }

    public void run() {

//        UBABank uba = new UBABank(0); // this is composition approach
//        uba.showBalance();

        uba.showBalance();

    }
}
