public class LunchSingleThread {
    public static void main(String[] args) throws InterruptedException {
        //main thread in java has priority 5, but we can change it by using setPriority()
        System.out.println("Application Started...");

        //Thread.sleep(5000);

        System.out.println("Application Running...");

        //Thread.sleep(5000);
        System.out.println("Application Ended...");
    }
}
