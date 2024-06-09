package objectLSynchro;

public class LunchOLSynch {
    public static void main(String[] args) {
    	UBABank ubaBank = new UBABank(4000);
        //UBABank ubaBank2 = new UBABank(4000);

        Atm atm = new Atm(ubaBank);// constructor injection
        atm.setName("ATM Thread");

        GooglePay gpl = new GooglePay(ubaBank);
        gpl.setName("GooglePay Thread");

        PhonePay phone = new PhonePay(ubaBank);
        phone.setName("PhonePay Thread");

        atm.start();
        gpl.start();
        phone.start();
    }
}
