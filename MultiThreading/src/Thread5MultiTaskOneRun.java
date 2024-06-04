import java.util.Scanner;

class Alpha4 implements Runnable {

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        if (tName.equals("BANKING")) {
            banking();
        } else if (tName.equals("FOCUS")) {
            printingImportantQuotes();
        } else {
            printingStart();
        }
    }

    public void printingImportantQuotes() {
        System.out.println("Printing Important Quotes Started...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus on yours goals...");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception Handled...");
            }
        }
        System.out.println("Printing Important Quotes Ended...");
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


public class Thread5MultiTaskOneRun {
    public static void main(String[] args) {
        // let's create single run() method with multiple threads
//        Alpha4 thread1 = new Alpha4();
//        Thread tread1 = new Thread(thread1);
//        tread1.start();

        //OR
        Alpha4 alpha4 = new Alpha4();
        Thread t1 = new Thread(alpha4);
        Thread t2 = new Thread(alpha4);
        Thread t3 = new Thread(alpha4);

        //Let's give a name to each threads
        t1.setName("BANKING");
        t2.setName("START");
        t3.setName("FOCUS");

        t1.start();
        t2.start();
        t3.start();


    }
}
