import java.util.Scanner;

class Alpha1 extends Thread {

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
        System.out.println("Banking Activity Ended...");
    }
}

class Beta1 extends Thread {
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

class Gamma1 extends Thread {

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
        System.out.println("Printing Important Quotes Ended...");
    }
}

public class MultiThread1 {
    public static void main(String[] args) {
        // Thread implements Runnable interface,
        // and Runnable interface has only one method: run()
        // Now as all the classes extend Thread class,
        // we can create an object of Thread class as a Parent class.
        // the thread class method must be executed inside run() method.

        Alpha1 thread1 = new Alpha1();
        Beta1 thread2 = new Beta1();
        Gamma1 thread3 = new Gamma1();
        thread1.start();
        thread2.start();
        thread3.start();

        //OR

//        Thread t1 = new Thread(new Alpha1());
//        Thread t2 = new Thread(new Beta1());
//        Thread t3 = new Thread(new Gamma1());
//
//        // The bellow is to hand over the stacks to JVM
//        t2.start();
//        t1.start();
//        t3.start();

    }
}
