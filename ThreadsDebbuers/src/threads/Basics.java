package threads;

public class Basics extends Thread{

    public Basics(){

    }
    public Basics(String name){
        super(name);
    }


    public static void main(String[] args) {
        System.out.println("Main Thread started");

//        Basics t1 = new Basics();
//        Basics  t2 = new Basics();
//
//        t1.setName("MyThread1");
//        t2.setName("MyThread2");

        Basics t1 = new Basics("MyThread1");
        Basics  t2 = new Basics("MyThread2");
        t1.start();// thread -0;
        t2.start();// thread -1;
        System.out.println("Main Thread ended");
    }
    public void run(){
        System.out.println("Task for my new Thread");
    }
}
