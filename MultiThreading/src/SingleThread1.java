public class SingleThread1 {
    public static void main(String[] args) throws InterruptedException {
        //==> Thread is a process in java. It is a light-weight process.
        //==> Thread is used to run multiple tasks at the same time.
        // -> There are 3 types of thread in java: 1. Thread 2. Runnable 3. Callable
        // OS level -> Thread is used to perform multiple tasks from multiple Apps at the same time.
        // App level -> Thread is used to perform multiple tasks from a single Apps at the same time.


        //Thread.sleep(5000);
        //main method behind the seen there is alwayss Thread. in java has priority 5, but we can change it by using setPriority()
        System.out.println("Application Started...");
        Thread.sleep(5000);

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());// every has default priority from 5 to 10

        //set Thread name and priority
        thread.setName("Prestij");
        thread.setPriority(4);
        System.out.println("*".repeat(30));

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        Thread.sleep(3000);
        System.out.println("Application Ended...");
    }
}
