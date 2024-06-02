import java.util.Scanner;

class Alpha {
    public void banking() {
        System.out.println("Banking Activity Started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int acc = sc.nextInt();
        System.out.println("Enter the password: ");
        int pass = sc.nextInt();
        System.out.println("Collect your cash...");
        System.out.println("Banking Activity Ended..");
    }
}

class Beta {
    public void printingStart() {
        System.out.println("Printing Activity Started...");
        for (int i = 0; i < 3; i++) {
            System.out.println("*");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception Handled...");
            }
        }
        System.out.println("Printing Activity Ended...");
    }
}

class Gamma {
    public void printingImportantQuotes() {
        System.out.println("Printing Important Quotes Started...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus on your goals...");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception Handled...");
            }
        }
        System.out.println("Printing Important Quotes Ended...");
    }
}

public class SingleThread2 {
    public static void main(String[] args) {
        // This way there is CPU time consumption.
        // because we are using single thread with multiple tasks.
        // they're depending on each other.
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();
        a.banking();
        b.printingStart();
        g.printingImportantQuotes();
    }
}
