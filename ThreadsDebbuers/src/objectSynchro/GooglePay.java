package objectSynchro;

public class GooglePay extends Thread {

    private UBABank uba;

    public GooglePay(UBABank uba) {
        this.uba = uba;
    }

    @Override
    public void run() {
        System.out.println("Deposit");
        //UBABank deposit = new UBABank(0);
        //deposit.deposit(6000);

        uba.deposit(6000);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
