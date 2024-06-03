import java.util.Scanner;

class Alpha2 implements Runnable {

    @Override
    public void run() {
        // every thread must be executed inside run();
        // the run() method is executed by JVM
        // developer must not call in run() method
        // the run() method is from Runnable interface
        // The Thread class implements Runnable interface
        banking();
    }

    public void banking() {
        System.out.println("Banking Activity Started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int acc = sc.nextInt();
        System.out.println("Enter the password: ");
        int pass = sc.nextInt();
        System.out.println("Collect your cash...");
        System.out.println("Banking Activity Ended");
    }
}

class Beta2 implements Runnable {
    @Override
    public void run() {
        printingStart();
    }

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

class Gamma2 implements Runnable {

    @Override
    public void run() {
        printingImportantQuotes();
    }

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
        System.out.println("Printing Important Quotes Ended....");
    }
}

public class MultiThread2 {
    public static void main(String[] args) {
        // implements Runnable interface is preferred over extends Thread class
        // as it is more efficient for multiple inheritance.
        // If you extend Thread class then you cannot extend other classes that's why it is not preferred
        Alpha2 alpha2 = new Alpha2();
        Beta2 beta2 = new Beta2();
        Gamma2 gamma2 = new Gamma2();

        Thread t1 = new Thread(alpha2);
        Thread t2 = new Thread(beta2);
        Thread t3 = new Thread(gamma2);

        // Before starting the Threads they are not at live.
        System.out.println(" Is Threads 1 at live? " + t1.isAlive());// false
        System.out.println("Is Threads 2 at live? " + t2.isAlive()); // false
        System.out.println("Is Threads 3 at live? " + t3.isAlive()); // false

        t1.start();
        t2.start();
        t3.start();
        // After starting the Threads they are at live.
        System.out.println(" Is Threads 1 at live? " + t1.isAlive());// true
        System.out.println("Is Threads 2 at live? " + t2.isAlive()); // true
        System.out.println("Is Threads 3 at live? " + t3.isAlive()); // true
    }
}
