package threads;


public class LunchThread2 implements Runnable {
    public static void main(String[] args) {

        LunchThread2 lt = new LunchThread2();// creating object but not a thread.

        //Thread t = new Thread("MyOwnThread");
        Thread thread1 = new Thread(new LunchThread2());
        thread1.start();

        Runnable r = () -> System.out.println("Task for my Runnable thread done");
        Thread thread2 = new Thread(r);
        thread2.start();

        Thread thread3= new Thread(() -> System.out.println("Task for my Thread3"));
        thread3.start();

    }

    @Override
    public void run() {
        System.out.println("Task for my new thread executed");
    }
}
