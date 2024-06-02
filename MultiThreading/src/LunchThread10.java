
class MSWord extends Thread {
    public void typing() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Typing");
                Thread.sleep(5000);
            }

        } catch (InterruptedException e) {

            System.out.println(" Error-in typing");
        }
    }

    public void spellChecking() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Editing");
                Thread.sleep(5000);
            }

        } catch (InterruptedException e) {
            System.out.println(" Error in editing");
        }
    }

    public void saving() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Saving");
                Thread.sleep(5000);
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

        MSWord obj1= new MSWord();
        MSWord obj2= new MSWord();
        MSWord obj3= new MSWord();

        obj1.setName("MSWord1");
        obj2.setName("MSWord2");
        obj3.setName("MSWord3");


        obj1.start();
        obj2.start();
        obj3.start();
    }
}
