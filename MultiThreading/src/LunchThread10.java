import java.util.Scanner;

class MSWord extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("TYPE")) {
            typing();
        } else if (name.equals("SPELL")) {
            spellCheck();
        } else {
            saving();
        }
    }

    public void typing() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Typing...");
                Thread.sleep(4000);
            }

        } catch (InterruptedException e) {

            System.out.println(" Error-in typing...");
        }
    }

    public void spellCheck() {
        try {
            for (; ; ) {
                System.out.println("Spell checking...");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println(" Error in editing...");
        }
    }

    public void saving() {
        try {
            for (; ; ) {
                System.out.println("Saving...");
                Thread.sleep(4000);
            }

        } catch (InterruptedException e) {
            System.out.println(" Error in saving");
        }
    }
}

public class LunchThread10 {
    public static void main(String[] args) {

        // "Daemon thread" is a thread that can be terminated by JVM
        // it is Garbage collection thread

        // As MSWord class is extended Thread class,
        // creating an object of MSWord class will create a thread
        // and MSWord class will be a daemon thread

        MSWord t1 = new MSWord();
        MSWord t2 = new MSWord();
        MSWord t3 = new MSWord();

//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Enter -> 1 for TYPING\n Enter -> 2 for SPELL CHECKING\n Enter -> 3 for SAVING");
//        int n = scan.nextInt();
//        if (n == 1) {
//            t1.setName("TYPE");
//        } else if (n == 2) {
//            t2.setName("SPELL");
//        } else if (n == 3) {
//            t3.setName("SAVE");
//        } else {
//            System.out.println("Wrong input!!!");
//            System.exit(0);
//        }


        t1.setName("TYPE");
        t2.setName("SPELL");
        t3.setName("SAVE");

        t2.setDaemon(true);// garbage collection at least it will execute one last time before JVM terminates.
        t3.setDaemon(true);// garbage collection

        t1.start();
        t2.start();
        t3.start();
    }
}
