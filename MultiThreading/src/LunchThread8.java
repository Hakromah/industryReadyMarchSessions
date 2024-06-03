class Car implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has Arrived at the parking lot");
            Thread.sleep(4000);

            synchronized (this) {
                // Here we applied synchronized (lock) to prevent the threads from accessing the car at the same time.
                System.out.println("<>".repeat(20));
                System.out.println(Thread.currentThread().getName() + " Starting the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Driving the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " has parked the car.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LunchThread8 {
    public static void main(String[] args) {
        Car car = new Car();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("AMARA");
        t2.setName("OUSAMA");
        t3.setName("FAROUK");

        t1.start();
        t2.start();
        t3.start();
    }
}
