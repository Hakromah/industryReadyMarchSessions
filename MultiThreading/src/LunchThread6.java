class Bathroom implements Runnable {
    @Override
synchronized public void run() {
        // We use synchronized to prevent the threads from accessing the bathroom at the same time.
        // synchronized is used to lock the resource until  the previous thread exits.
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " is using the bathroom.");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println(" ");
    }
}

public class LunchThread6 {
    public static void main(String[] args) {
        // We use synchronized to prevent the threads from accessing the bathroom at the same time.
        // synchronized is used to lock the resource until  the previous thread exits.
        // synchronized environment only one thread can access the resource at a time.

        Bathroom bath = new Bathroom();
        Thread t1 = new Thread(bath);
        Thread t2 = new Thread(bath);
        Thread t3 = new Thread(bath);

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");

        t1.start();
        t2.start();
        t3.start();
    }
}
