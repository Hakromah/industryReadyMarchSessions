

class Books implements Runnable {
    // Let say we have  3 resources (books) in the library and 2 students want to acquire them
    // We want if Student 1 get chance to catch a book first, the Student 2 should not get
    // chance to have one until student 1 finish

    String res1 = new String("JAVA");
    String res2 = new String("DSA");
    String res3 = new String("SPRING BOOT");

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("STUDENT1")) {
            try {
                Thread.sleep(4000);
                synchronized (res1) {
                    System.out.println("Student 1 has acquired " + res1);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student 1 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student 1 has acquired " + res3);
                            Thread.sleep(3000);
                            System.out.println("•".repeat(35));
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        } else {
            try {
                Thread.sleep(4000);
                synchronized (res1) {
                    System.out.println("Student 2 has acquired " + res1);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student 2 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student 2 has acquired " + res3);
                            Thread.sleep(3000);
                            System.out.println("•".repeat(35));
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}

public class LunchThread9 {
    public static void main(String[] args) {
        Books bk = new Books();

        Thread t1 = new Thread(bk);
        Thread t2 = new Thread(bk);

        t1.setName("STUDENT1");
        t2.setName("STUDENT2");

        t1.start();
        t2.start();
    }
}
