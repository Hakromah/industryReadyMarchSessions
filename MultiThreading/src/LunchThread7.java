class Resource implements Runnable {
    public void run() {
        try {
            for (int i = 65; i < 71; i++) {
                System.out.println((char) i);
                Thread.sleep(3000);
            }

            synchronized (this) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("*");
                    Thread.sleep(3000);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class LunchThread7 {
    public static void main(String[] args) {

        Resource res = new Resource();
        Thread t1 = new Thread(res);
        Thread t2 = new Thread(res);

        t1.start();
        t2.start();
    }
}
