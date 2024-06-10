package classLSynchro;

public class LunchClassLSynch {
    public static void main(String[] args) {

		UBABank ubaBank1 = new UBABank();
		UBABank ubaBank2 = new UBABank();


        Atm atm = new Atm();// constructor injection
        atm.setName("ATM Thread");

        GooglePay gpl = new GooglePay();
        gpl.setName("GooglePay Thread");

        PhonePay phone = new PhonePay(ubaBank1);
        phone.setName("PhonePay Thread");

        atm.start();
        gpl.start();
        phone.start();
    }
}
