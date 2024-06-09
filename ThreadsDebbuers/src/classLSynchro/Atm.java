package classLSynchro;

public class Atm extends Thread {
    // we extend Atm class from Thread class that means if you create object of
    // Atm class then it will be a thread created.



    public void run() {
        
        System.out.println("Withdrawal");
        UBABank.withdrawal(4000);
        
    }
}
